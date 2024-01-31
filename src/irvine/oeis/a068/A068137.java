package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068137 Smallest prime beginning and ending symmetrically with concatenation of first n natural numbers. Need not be a palindrome.
 * @author Sean A. Irvine
 */
public class A068137 extends Sequence1 {

  private final StringBuilder mLeft = new StringBuilder();
  private final StringBuilder mRight = new StringBuilder();
  private long mN = 0;

  @Override
  public Z next() {
    mLeft.append(++mN);
    mRight.insert(0, mN);
    final Z t0 = new Z(mLeft.toString() + mRight);
    if (t0.isProbablePrime()) {
      return t0;
    }
    long lim = 20;
    long k = 9;
    while (true) {
      if (++k == lim) {
        lim *= 10;
        k = lim / 2;
      }
      final Z t = new Z(mLeft + String.valueOf(k).substring(1) + mRight);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
