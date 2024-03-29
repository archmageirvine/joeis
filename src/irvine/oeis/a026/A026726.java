package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026726 a(n) = T(2n,n), T given by A026725.
 * @author Sean A. Irvine
 */
public class A026726 extends A026725 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
