package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001671 Powers of e rounded up.
 * @author Sean A. Irvine
 */
public class A001671 extends Sequence0 {

  private CR mE = null;

  @Override
  public Z next() {
    if (mE == null) {
      mE = CR.ONE;
    } else {
      mE = mE.multiply(CR.E);
    }
    return mE.ceil();
  }
}
