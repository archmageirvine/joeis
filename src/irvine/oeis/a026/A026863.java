package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026863 T(2n,n+3), T given by A026747.
 * @author Sean A. Irvine
 */
public class A026863 extends A026747 {

  private long mN = 2;

  @Override
  public Z next() {
    return get(2 * ++mN, mN + 3);
  }
}
