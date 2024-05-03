package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002385;

/**
 * A069503 a(1) = 2; a(n) = smallest palindromic prime of the form k*a(n-1) + 1.
 * @author Sean A. Irvine
 */
public class A069503 extends Sequence1 {

  private Z mA = null;
  private final Sequence mPalindromicPrimes = new A002385().skip();

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
      while (true) {
        final Z t = mPalindromicPrimes.next();
        if (t.mod(mA).equals(Z.ONE)) {
          mA = t;
          break;
        }
      }
    }
    return mA;
  }
}

