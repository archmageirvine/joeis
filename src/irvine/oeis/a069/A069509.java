package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A069509 a(1) = 8; a(n) = smallest palindromic number of the form k*a(n-1) + 1 with k &gt; 1.
 * @author Sean A. Irvine
 */
public class A069509 extends Sequence1 {

  private Z mA = null;
  private final Sequence mPalindromes = new A002113().skip(8);

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.EIGHT;
    } else {
      while (true) {
        final Z t = mPalindromes.next();
        if (t.mod(mA).equals(Z.ONE) && t.subtract(mA).compareTo(Z.ONE) > 0) {
          mA = t;
          break;
        }
      }
    }
    return mA;
  }
}

