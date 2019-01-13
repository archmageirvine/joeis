package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001671.
 * @author Sean A. Irvine
 */
public class A001671 implements Sequence {

  private static final CR E = UnaryCRFunction.EXP.execute(CR.ONE);
  private CR mE = null;

  @Override
  public Z next() {
    if (mE == null) {
      mE = CR.ONE;
    } else {
      mE = mE.multiply(E);
    }
    return mE.ceil(32);
  }
}
