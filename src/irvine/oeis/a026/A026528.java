package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026528 a(n) = T(2n-1,n-1), T given by A026519.
 * @author Sean A. Irvine
 */
public class A026528 extends A026519 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN - 1);
  }
}
