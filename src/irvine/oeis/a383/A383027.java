package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000290;

/**
 * A383027 allocated for Zhining Yang.
 * @author Sean A. Irvine
 */
public class A383027 extends Sequence1 {

  private final Sequence mSquares = new A000290();
  private Z mLim = Z.ONE;
  private Z mS = mSquares.next();

  @Override
  public Z next() {
    mLim = mLim.multiply(10);
    Z max = Z.ZERO;
    while (mS.compareTo(mLim) < 0) {
      max = max.max(Functions.REVERSE.z(mS));
      mS = mSquares.next();
    }
    return Functions.REVERSE.z(max).sqrt();
  }
}

