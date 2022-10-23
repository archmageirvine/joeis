package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001369 Blocks of increasing length using 1,2,3,...,9,10; omit leading 0's.
 * @author Sean A. Irvine
 */
public class A001369 extends Sequence1 {

  private static final String DIGITS = "12345678910";

  private int mLength = 0;
  private int mPos = 0;

  @Override
  public Z next() {
    ++mLength;
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < mLength; ++k) {
      sb.append(DIGITS.charAt(mPos));
      ++mPos;
      mPos %= DIGITS.length();
    }
    return new Z(sb);
  }
}
