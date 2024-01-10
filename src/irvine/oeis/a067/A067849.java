package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067849 a(n) = max{k: f(n),...,f^k(n) are prime}, where f(m) = 2m+1 and f^k denotes composition of f with itself k times.
 * @author Sean A. Irvine
 */
public class A067849 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN);
    long cnt = 0;
    while ((t = t.multiply2().add(1)).isProbablePrime()) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
