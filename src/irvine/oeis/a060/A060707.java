package irvine.oeis.a060;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060707 Base-60 (Babylonian or sexagesimal) expansion of Pi.
 * @author Sean A. Irvine
 */
public class A060707 extends Sequence1 {

  // Because base > 36 we cannot use the usual DecimalExpansionSequence class

  private static final Z Z60 = Z.valueOf(60);
  private Z mMul = null;

  @Override
  public Z next() {
    mMul = mMul == null ? Z.ONE : mMul.multiply(60);
    return CR.PI.multiply(mMul).floor().mod(Z60);
  }
}
