package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067760 a(n) is the least positive k such that (2n+1) + 2^k is prime, or 0 if no such k exists.
 * @author Sean A. Irvine
 */
public class A067760 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 39278) {
      return Z.ZERO;
    }
    long k = 0;
    Z t = Z.ONE;
    final long a = 2 * mN + 1;
    while (true) {
      t = t.multiply2();
      ++k;
      if (t.add(a).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
