package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026775 a(n) = T(n, floor(n/2)), T given by A026769.
 * @author Sean A. Irvine
 */
public class A026775 extends A026769 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
