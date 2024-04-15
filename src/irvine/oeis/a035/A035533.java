package irvine.oeis.a035;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035533 Number of numbers up to 10^n with exactly 4 divisors.
 * @author Sean A. Irvine
 */
public class A035533 extends Sequence1 {

  private long mLimit = 1;
  private long mN = 1;
  private long mCnt = 0;

  @Override
  public Z next() {
    mLimit *= 10;
    while (++mN <= mLimit) {
      if (Functions.SIGMA0.l(mN) == 4) {
        ++mCnt;
      }
    }
    --mN;
    return Z.valueOf(mCnt);
  }
}

