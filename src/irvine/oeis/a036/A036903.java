package irvine.oeis.a036;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036903 Scan decimal expansion of Pi until all n-digit strings have been seen; a(n) is number of digits that must be scanned.
 * @author Sean A. Irvine
 */
public class A036903 implements Sequence {

  private final CR mA = getCR();
  private int mDigits = 1000;
  private String mS = mA.toString(mDigits);
  private long mN = -1;
  private long mLimit = 1;
  private long mLength = 0;

  protected CR getCR() {
    return CR.PI.divide(CR.TEN); // So we can ignore the period
  }

  private int pos(final String n) {
    int pos;
    while ((pos = mS.indexOf(n, 2)) < 0) {
      mDigits *= 2;
      mS = mA.toString(mDigits);
    }
    return pos;
  }

  private int pos(final long n) {
    return pos(String.valueOf(n));
  }

  @Override
  public Z next() {
    ++mLength;
    mLimit *= 10;
    int maxPos = 0;
    while (++mN < mLimit) {
      final int pos = pos(mN);
      if (pos > maxPos) {
        maxPos = pos;
      }
    }
    --mN;
    return Z.valueOf(maxPos + mLength - 3);
  }
}
