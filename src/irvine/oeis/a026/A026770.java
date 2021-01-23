package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026770 a(n) = T(2n,n), T given by A026769.
 * @author Sean A. Irvine
 */
public class A026770 extends A026769 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
