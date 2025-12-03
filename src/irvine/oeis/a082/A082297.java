package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.a083.A083861;

/**
 * A082297 Main diagonal of array A083861.
 * @author Sean A. Irvine
 */
public class A082297 extends A083861 {

  private int mN = -1;

  @Override
  public Z next() {
    return mB.get(++mN, mN);
  }
}
