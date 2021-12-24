package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026530 a(n) = T(n, floor(n/2)), T given by A026519.
 * @author Sean A. Irvine
 */
public class A026530 extends A026519 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
