package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.series.Hypergeometric;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A394980 Number of 2n-digit decimal strings where the second half is an anagram of the first half.
 * @author Sean A. Irvine
 */
public class A394980 extends Sequence0 {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private final Series<Q> mS = SQ.pow(Hypergeometric.s(new Q[0], new Q[] {Q.ONE}, SQ.x()), 10);
  private long mN = -1;

  @Override
  public Z next() {
    return mS.coeff(++mN).multiply(Functions.FACTORIAL.z(mN).square()).toZ();
  }
}
