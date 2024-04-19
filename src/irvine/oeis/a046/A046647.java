package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A046647 Number of certain rooted planar maps.
 * @author Sean A. Irvine
 */
public class A046647 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.ONE;
    } else {
      return Functions.FACTORIAL.z(3 * mN - 6).multiply(7L * mN - 15).multiply(4)
        .divide(Functions.FACTORIAL.z(2 * mN - 2)).divide(Functions.FACTORIAL.z(mN - 2));
    }
  }
}
