package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026525 a(n) = T(2n,n), T given by A026519.
 * @author Sean A. Irvine
 */
public class A026525 extends A026519 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
