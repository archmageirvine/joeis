package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026705 T(2n,n-1), T given by A026703.
 * @author Sean A. Irvine
 */
public class A026705 extends A026703 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 1);
  }
}
