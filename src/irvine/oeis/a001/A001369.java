package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001369.
 * @author Sean A. Irvine
 */
public class A001369 implements Sequence {

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
    return new Z(sb.toString());
  }
}
