package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026759 a(n) = T(2n, n), T given by A026758.
 * @author Sean A. Irvine
 */
public class A026759 extends A026758 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
