package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026685 T(2n-1,n-1), T given by A026681.
 * @author Sean A. Irvine
 */
public class A026685 extends A026681 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN - 1);
  }
}
