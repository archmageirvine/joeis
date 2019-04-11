package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001672 <code>a(n) =</code> floor(Pi^n).
 * @author Sean A. Irvine
 */
public class A001672 implements Sequence {

  private CR mPi = null;

  @Override
  public Z next() {
    if (mPi == null) {
      mPi = CR.ONE;
    } else {
      mPi = mPi.multiply(CR.PI);
    }
    return mPi.floor(32);
  }
}
