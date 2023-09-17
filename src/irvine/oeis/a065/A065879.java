package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a272.A272756;

/**
 * A065879 a(n) is the smallest positive number that is n times the number of 1's in its binary expansion, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A065879 extends A272756 {

  private long mN = 0;

  @Override
  public Z next() {
    final long lim = ++mN * super.next().longValueExact();
    for (long k = 1; k <= lim; ++k) {
      if (mN * Long.bitCount(k) == k) {
        return Z.valueOf(k);
      }
    }
    return Z.ZERO;
  }
}
