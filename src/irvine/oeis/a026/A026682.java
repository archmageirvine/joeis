package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026682 T(2n,n), T given by A026681.
 * @author Sean A. Irvine
 */
public class A026682 extends A026681 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
