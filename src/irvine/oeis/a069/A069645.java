package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000290;

/**
 * A069645 Define sds(n) = sum of the squares of the digits of n. Sequence gives smaller of two consecutive squares with sds(k^2) = sds((k+1)^2).
 * @author Sean A. Irvine
 */
public class A069645 extends Sequence0 {

  private final Sequence mSquares = new A000290();
  private Z mS = mSquares.next();
  private Z mSS = Functions.DIGIT_SUM_SQUARES.z(mS);

  @Override
  public Z next() {
    while (true) {
      final Z t = mS;
      final Z ts = mSS;
      mS = mSquares.next();
      mSS = Functions.DIGIT_SUM_SQUARES.z(mS);
      if (mSS.equals(ts)) {
        return t;
      }
    }
  }
}
