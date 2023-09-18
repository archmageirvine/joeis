package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a272.A272756;

/**
 * A065880 Largest positive number that is n times the number of 1's in its binary expansion, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A065880 extends A272756 {

  {
    setOffset(0);
  }
  private long mN = -1;

  @Override
  public Z next() {
    final long lim = ++mN * super.next().longValueExact();
    for (long k = lim; k > 0; --k) {
      if (mN * Long.bitCount(k) == k) {
        return Z.valueOf(k);
      }
    }
    return Z.ZERO;
  }
}
