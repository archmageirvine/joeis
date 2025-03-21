package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000796;

/**
 * A076129 Position of first n-digit prime encountered in decimal expansion of Pi (ignoring the initial 3).
 * @author Sean A. Irvine
 */
public class A076129 extends Sequence1 {

  private final StringBuilder mPiDigits = new StringBuilder();
  private final Sequence mPi = new A000796().skip();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    int k = 0;
    while (true) {
      if (k + mN >= mPiDigits.length()) {
        mPiDigits.append(mPi.next());
      }
      if (mPiDigits.charAt(k) != '0') {
        final Z t = new Z(mPiDigits.substring(k, k + mN));
        if (t.isProbablePrime()) {
          return Z.valueOf(k + 1);
        }
      }
      ++k;
    }
  }
}
