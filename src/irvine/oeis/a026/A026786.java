package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026786 a(n) = T(n, floor(n/2)), T given by A026780.
 * @author Sean A. Irvine
 */
public class A026786 extends A026780 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
