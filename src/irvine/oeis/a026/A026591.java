package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026591 a(n) = T(2*n, n-1), where T is given by A026584.
 * @author Sean A. Irvine
 */
public class A026591 extends A026584 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 1);
  }
}
