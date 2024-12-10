package irvine.oeis.a007;
// manually 2024-12-06

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A007376 The almost-natural numbers: write n in base 10 and juxtapose digits.
 * @author Georg Fischer
 */
public class A007376 extends AbstractSequence implements DirectSequence {

  //private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private static final int[] LIMIT = new int[7];

  static { // store upper limits of ranges:
    // num       0-9, 10-99, 100-999, 1000-9999, ...
    // mLimit 0   10    190     3210      43210
    // il     0    1      2        3          4
    // pow10  1   10    100     1000      10000
    LIMIT[0] = 1;
    int pow10 = 1;
    for (int il = 1; il < LIMIT.length; ++il) {
      LIMIT[il] = LIMIT[il - 1] + (pow10 * 10 - pow10) * il;
      pow10 *= 10;
    }
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A007376(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A007376() {
    super(0);
  }

  private String mS = "";
  private int mPos = 0;
  private Z mN = null;

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    if (n <= 9) {
      return Z.valueOf(n);
    }
    int il = 1;
    int pow10 = 1;
    while (n >= LIMIT[il]) {
      pow10 *= 10;
      ++il;
    }
    // now mLimit[il - 1] <= n < mLimit[il]; il = number of digits in num; pow10 = 10^(il - 1); range [pow10..pow10*10-1]
    final int num = (n - LIMIT[il - 1]) / il + pow10;
    final int mod = (n - LIMIT[il - 1]) % il;
//  if (mVerbose) {
//    System.out.println("\n# n=" + n + ", il=" + il + ",pow10=" + pow10 + ", mLimit[il - 1]=" + mLimit[il - 1] + ", num=" + num + ", mod=" + mod);
//  }
    return Z.valueOf(Integer.toString(num).charAt(mod) - '0');
  }

  @Override
  public Z next() {
    if (mN == null) {
      mN = Z.ZERO;
      return Z.ZERO;
    }
    ++mPos;
    if (mPos >= mS.length()) {
      mN = mN.add(1);
      mS = mN.toString(10);
      mPos = 0;
    }
    return Z.valueOf(mS.charAt(mPos) - '0');
  }
}
