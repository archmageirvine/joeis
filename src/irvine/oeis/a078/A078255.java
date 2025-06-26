package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000290;

/**
 * A078255 Squares with distinct digits. To make an infinite sequence, we also include m-digit numbers in which each digit occurs no more than ceiling(m/10) times.
 * @author Sean A. Irvine
 */
public class A078255 extends Sequence1 {

  private final Sequence mSquares = new A000290();
  private Z mL = Z.TEN;
  private int mDigits = 1;

  @Override
  public Z next() {
    while (true) {
      final Z s = mSquares.next();
      if (s.compareTo(mL) >= 0) {
        mL = mL.multiply(10);
        ++mDigits;
      }
      final int cnt = Functions.MAX.i(ZUtils.digitCounts(s));
      if (10 * cnt <= mDigits + 9) {
        return s;
      }
    }
  }
}

