package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026764 a(n) = T(n, floor(n/2)), T given by A026758.
 * @author Sean A. Irvine
 */
public class A026764 extends A026758 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
