package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066410 Maximal sum of divisors of any n-digit number.
 * @author Sean A. Irvine
 */
public class A066410 extends Sequence1 {

  private long mLim = 1;

  @Override
  public Z next() {
    Z max = Z.ZERO;
    long m = mLim;
    mLim *= 10;
    while (m < mLim) {
      final Z s = Jaguar.factor(m).sigma();
      max = max.max(s);
      ++m;
    }
    return max;
  }
}
