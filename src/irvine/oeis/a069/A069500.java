package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002779;

/**
 * A069457.
 * @author Sean A. Irvine
 */
public class A069500 extends Sequence1 {

  private Z mA = null;
  private final Sequence mPalindromicSquares = new A002779().skip(2);

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      while (true) {
        final Z t = mPalindromicSquares.next();
        if (t.mod(mA).isZero()) {
          mA = t;
          break;
        }
      }
    }
    return mA;
  }
}

