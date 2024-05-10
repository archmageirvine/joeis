package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a003.A003098;

/**
 * A069502 a(1) = 1; a(n) = smallest multiple of a(n-1) which is a palindromic triangular number.
 * @author Sean A. Irvine
 */
public class A069502 extends Sequence0 {

  private Z mA = null;
  private final Sequence mPalindromicTriangular = new A003098().skip(2);

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      while (true) {
        final Z t = mPalindromicTriangular.next();
        if (t.mod(mA).isZero()) {
          mA = t;
          break;
        }
      }
    }
    return mA;
  }
}

