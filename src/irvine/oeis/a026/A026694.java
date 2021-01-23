package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026694 T(2n,n-1), T given by A026692.
 * @author Sean A. Irvine
 */
public class A026694 extends A026692 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 1);
  }
}
