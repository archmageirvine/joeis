package irvine.oeis.a394;

import java.util.HashMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A394453 a(n) = number of iterations of f(n) = sigma(n) if sigma(n) &lt; 2n (n deficient), else n / spf(n) (where spf(n) is the smallest prime factor), needed to reach a cycle, for n &gt;= 2.
 * @author Sean A. Irvine
 */
public class A394453 extends Sequence2 {

  private long mN = 1;

  private Z f(final Z n) {
    final Z s = Functions.SIGMA1.z(n);
    return s.compareTo(n.multiply2()) < 0 ? s : n.divide(Functions.LPF.z(n));
  }

  @Override
  public Z next() {
    final HashMap<Z, Long> map = new HashMap<>();
    long k = 0;
    Z m = Z.valueOf(++mN);
    while (map.putIfAbsent(m, ++k) == null) {
      m = f(m);
    }
    return Z.valueOf(map.get(m) - 1);
  }
}
