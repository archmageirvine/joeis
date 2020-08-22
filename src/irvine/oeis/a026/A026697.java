package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026697 T(2n-1,n-2), T given by A026692.
 * @author Sean A. Irvine
 */
public class A026697 extends A026692 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN - 2);
  }
}
