package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026859 T(2n,n-4), T given by A026747.
 * @author Sean A. Irvine
 */
public class A026859 extends A026747 {

  private long mN = 3;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 4);
  }
}
