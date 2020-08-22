package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026742 a(n) = T(n, floor(n/2)), T given by A026736.
 * @author Sean A. Irvine
 */
public class A026742 extends A026736 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
