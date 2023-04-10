package irvine.oeis.a361;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A361669 allocated for Sylvia Zevi Abrams.
 * @author Sean A. Irvine
 */
public class A361669 extends Sequence0 {

  private CR mA = null;

  @Override
  public Z next() {
    mA = mA == null ? CR.ONE : mA.sinh();
    return mA.floor();
  }
}
