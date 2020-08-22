package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026753 a(n) = T(n, floor(n/2)), T given by A026747.
 * @author Sean A. Irvine
 */
public class A026753 extends A026747 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
