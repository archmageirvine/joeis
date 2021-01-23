package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026750 a(n) = T(2n,n-2), T given by A026747.
 * @author Sean A. Irvine
 */
public class A026750 extends A026747 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 2);
  }
}
