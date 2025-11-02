package irvine.oeis.a390;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390095 allocated for Chittaranjan Pardeshi.
 * @author Sean A. Irvine
 */
public class A390095 extends Sequence1 {

  private CR mA = CR.SQRT_PI;

  @Override
  public Z next() {
    final Z res = mA.compareTo(CR.PHI) >= 0 ? Z.ONE : Z.ZERO;
    mA = mA.subtract(CR.PHI.multiply(res)).multiply(CR.PHI);
    return res;
  }
}
