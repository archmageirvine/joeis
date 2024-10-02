package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072442 Least k such that Sum( Cos(1/Sqrt(i)) i=1..k) &gt; n.
 * @author Sean A. Irvine
 */
public class A072442 extends Sequence0 {

  private static final int DEFAULT_COMPARE_PRECISION = -100;
  private CR mSum = CR.ZERO;
  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final CR n = CR.valueOf(mN);
    while (mSum.compareTo(n, DEFAULT_COMPARE_PRECISION) <= 0) {
      mSum = mSum.add(CR.valueOf(++mM).sqrt().inverse().cos());
    }
    return Z.valueOf(mM + 1);
  }
}

