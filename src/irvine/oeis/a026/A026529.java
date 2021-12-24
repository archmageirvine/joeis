package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026529 a(n) = T(2*n-1, n-2), where T is given by A026519.
 * @author Sean A. Irvine
 */
public class A026529 extends A026519 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN - 2);
  }
}
