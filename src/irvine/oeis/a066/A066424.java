package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066424 The n-digit number whose divisors have the maximal sum (A066410).
 * @author Sean A. Irvine
 */
public class A066424 extends Sequence1 {

  private long mLim = 1;

  @Override
  public Z next() {
    Z max = Z.ZERO;
    long maxM = 0;
    long m = mLim;
    mLim *= 10;
    while (m < mLim) {
      final Z s = Functions.SIGMA1.z(m);
      if (s.compareTo(max) > 0) {
        max = s;
        maxM = m;
      }
      ++m;
    }
    return Z.valueOf(maxM);
  }
}
