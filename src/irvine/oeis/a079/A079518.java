package irvine.oeis.a079;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesParser;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079518 Coefficients related to tennis ball problem.
 * @author Sean A. Irvine
 */
public class A079518 extends Sequence0 {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private int mN = 4;
  private final Series<Q> mC = SeriesParser.parse("(1-sqrt(1-4*x))/(2*x)");
  private final Series<Q> mD = SeriesParser.parse("(1-(1+2*x)*(sqrt(1-4*x))-(1-2*x)*(sqrt(1+4*x))+(sqrt(1-16*x^2)))/(4*x^2)");
  private final Series<Q> mG = SQ.multiply(mD, SQ.pow(SQ.shift(mC, 1), 6));

  @Override
  public Z next() {
    mN += 2;
    return mG.coeff(mN).toZ();
  }
}
