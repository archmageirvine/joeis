package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026628 T(2n,n-1), T given by A026626.
 * @author Sean A. Irvine
 */
public class A026628 extends A026626 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 1);
  }
}
