package irvine.oeis.a056;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A056734 Positive numbers k such that, in base 3, 2^k and 2^(k+1) have the same number of digits and the same number of 0's.
 * @author Sean A. Irvine
 */
public class A056734 implements Sequence {

  private Z mA = Z.TWO;
  private int[] mCnts = ZUtils.digitCounts(mA, 3);
  private long mN = 1;
  private final int mDigit;

  protected A056734(final int digit) {
    mDigit = digit;
  }

  /** Construct the sequence. */
  public A056734() {
    this(0);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final int[] tc = mCnts;
      mA = mA.multiply2();
      mCnts = ZUtils.digitCounts(mA, 3);
      if (tc[mDigit] == mCnts[mDigit] && IntegerUtils.sum(tc) == IntegerUtils.sum(mCnts)) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
