package irvine.oeis.a390;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a075.A075834;

/**
 * A390400 Number of chord-connected permutations on [n].
 * @author Sean A. Irvine
 */
public class A390400 extends Sequence1 {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private final Series<Q> mG = Series.create(new A075834());
  private Series<Q> mA = SQ.one();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    // The truncate is for efficiency
    mA = SQ.truncate(SQ.substitute(mG, SQ.divide(SQ.x(), mA)), mN);
    return mA.coeff(mN).toZ();
  }
}
