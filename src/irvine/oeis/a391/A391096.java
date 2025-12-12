package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391096 allocated for Jim Hays.
 * @author Sean A. Irvine
 */
public class A391096 extends Sequence1 {

  private long mLength = 0;
  private long mM = 1;

  private boolean is(final long n) {
    return mLength + Functions.DIGIT_LENGTH.l(n) == n;
  }

  @Override
  public Z next() {
    while (true) {
      // Skip over numbers that are too small
      final int len = Functions.DIGIT_LENGTH.i(mM);
      if (mLength + len <= mM) {
        break;
      }
      ++mM;
    }
    // Now see how far we can go
    while (is(mM + 1)) {
      ++mM;
    }
    mLength += Functions.DIGIT_LENGTH.l(mM) + 1;
    return Z.valueOf(mM);
  }
}
