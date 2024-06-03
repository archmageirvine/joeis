package irvine.oeis.a070;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070197 Base-60 (or sexagesimal or Babylonian) expansion of sqrt(2).
 * @author Sean A. Irvine
 */
public class A070197 extends Sequence1 {

  // Because the base is > 36 we cannot use DecimalExpansionSequence

  private static final Z Z60 = Z.valueOf(60);
  private Z mT = null;

  @Override
  public Z next() {
    mT = mT == null ? Z.ONE : mT.multiply(60);
    return CR.SQRT2.multiply(mT).floor().mod(Z60);
  }
}
