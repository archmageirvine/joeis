package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051584 Number of integer-sided triangles of area n.
 * @author Sean A. Irvine
 */
public class A051584 extends A051585 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 6) {
      mN = 0;
      return super.next();
    }
    return Z.ZERO;
  }
}
