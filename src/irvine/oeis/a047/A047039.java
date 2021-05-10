package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047039 T(2n,n), array T as in A047030.
 * @author Sean A. Irvine
 */
public class A047039 extends A047030 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
