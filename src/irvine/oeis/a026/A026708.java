package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026708 T(2n-1,n-2), T given by A026703.
 * @author Sean A. Irvine
 */
public class A026708 extends A026703 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN - 2);
  }
}
