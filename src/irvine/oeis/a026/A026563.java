package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026563 a(n) = T(n, floor(n/2)), where T is given by A026552.
 * @author Sean A. Irvine
 */
public class A026563 extends A026552 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
