package irvine.oeis.a383;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000796;

/**
 * A383690 Positions of digits in the decimal expansion of Pi where the cumulative sum of even digits equals the cumulative sum of odd digits (positions 1, 2, 3, ... refer to the digits 3, 1, 4, ...).
 * @author Sean A. Irvine
 */
public class A383690 extends Sequence1 {

  private final Sequence mPi = new A000796();
  private long mSum = 0;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long d = mPi.next().longValue();
      if ((d & 1) == 0) {
        mSum += d;
      } else {
        mSum -= d;
      }
      if (mSum == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

