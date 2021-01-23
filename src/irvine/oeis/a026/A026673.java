package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026673 a(n) = T(2n,n-2), T given by A026670.
 * @author Sean A. Irvine
 */
public class A026673 extends A026670 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 2);
  }
}
