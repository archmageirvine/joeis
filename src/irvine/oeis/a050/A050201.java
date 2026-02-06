package irvine.oeis.a050;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A050201 Starting positions of strings of 2 0's in the decimal expansion of Pi.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A050201 extends Sequence1 {

  private static final CR PI10 = CR.PI.divide(10); // shift decimal point
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final String mMatch;
  private String mS = PI10.toString(1024);
  private int mPos;

  /** Construct the sequence. */
  public A050201() {
    this(2, 0);
  }
  
  /**
   * Generic constructor with parameters.
   * @param occurrences number of occurrences required
   * @param digit desired digit
   */
  public A050201(final int occurrences, final int digit) {
    assert occurrences > 0;
    mMatch = String.valueOf(digit).repeat(occurrences);
    mPos = 0;
  }

  @Override
  public Z next() {
    while (true) {
      final int nextPos = mS.indexOf(mMatch, mPos);
      if (nextPos < 0) {
        mS = PI10.toString(2 * mS.length());
        if (mVerbose) {
          StringUtils.message("pi expanded to " + (mS.length() - 3) + " digits");
        }
      } else {
        mPos = nextPos + 1;
        return Z.valueOf(mPos - 3);
      }
    }
  }
}
