package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A062927 Numbers k such that k divides the sum of digits of 9^k.
 * @author Sean A. Irvine
 */
public class A062927 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final long mMul;
  private Z mA = Z.ONE;
  private long mN = 0;

  protected A062927(final long mul) {
    mMul = mul;
  }

  /** Construct the sequence. */
  public A062927() {
    this(9);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply(mMul);
      if (ZUtils.digitSum(mA) % mN == 0) {
        return Z.valueOf(mN);
      }
      if (mVerbose && mN % 10000 == 0) {
        StringUtils.message("Search completed to " + mN);
      }
    }
  }
}

