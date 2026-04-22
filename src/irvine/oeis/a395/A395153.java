package irvine.oeis.a395;

import java.util.HashMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A395153 allocated for Lu Zhuofan.
 * @author Sean A. Irvine
 */
public class A395153 extends Sequence2 {

  // todo not yet matching

  private long mN = 1;

  private Z f(final Z n) {
    final Z s = Functions.SIGMA1.z(n);
    return s.compareTo(n.multiply2()) < 0 ? s : n.divide(Functions.GPF.z(n));
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
