package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026706 T(2n,n-2), T given by A026703.
 * @author Sean A. Irvine
 */
public class A026706 extends A026703 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 2);
  }
}
