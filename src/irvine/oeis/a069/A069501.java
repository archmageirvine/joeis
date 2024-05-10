package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002779;

/**
 * A069501 a(1) = 9; a(n) = smallest multiple of a(n-1) which is a palindromic square.
 * @author Sean A. Irvine
 */
public class A069501 extends Sequence0 {

  private Z mA = null;
  private final Sequence mPalindromicSquares = new A002779().skip(4);

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.NINE;
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

