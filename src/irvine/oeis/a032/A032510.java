package irvine.oeis.a032;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032510 Scan decimal expansion of <code>Pi</code> until all n-digit strings have been seen; <code>a(n)</code> is last string seen.
 * @author Sean A. Irvine
 */
public class A032510 implements Sequence {

  private static final CR PI0 = CR.PI.divide(CR.TEN); // So we can ignore the period
  private int mDigits = 1000;
  private String mPi = PI0.toString(mDigits);
  private long mN = -1;
  private long mLimit = 1;

  private int pos(final String n) {
    int pos;
    while ((pos = mPi.indexOf(n, 2)) < 0) {
      mDigits *= 2;
      mPi = PI0.toString(mDigits);
    }
    return pos;
  }

  private int pos(final long n) {
    return pos(String.valueOf(n));
  }

  @Override
  public Z next() {
    mLimit *= 10;
    int maxPos = 0;
    long maxValue = 0;
    while (++mN < mLimit) {
      final int pos = pos(mN);
      if (pos > maxPos) {
        maxPos = pos;
        maxValue = mN;
      }
    }
    --mN;
    return Z.valueOf(maxValue);
  }
}
