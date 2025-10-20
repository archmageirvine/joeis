package irvine.oeis.a388;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a013.A013929;

/**
 * A388005 allocated for Henri Lifchitz.
 * @author Sean A. Irvine
 */
public class A388005 extends Sequence0 {

  private Z mLim = null;
  private final Sequence mS = new A013929();
  private Z mA = mS.next();
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mLim = mLim == null ? Z.ONE : mLim.multiply(10);
    while (mA.compareTo(mLim) <= 0) {
      mSum = mSum.add(mA);
      mA = mS.next();
    }
    return mSum;
  }
}

