package irvine.oeis.a079;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesParser;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079522 Diagonal of triangular array in A079520.
 * @author Sean A. Irvine
 */
public class A079522 extends Sequence0 {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private int mN = -1;
  private final Series<Q> mC = SeriesParser.parse("(1-sqrt(1-4*x))/(2*x)");
  private final Series<Q> mD = SeriesParser.parse("(1-(1+2*x)*(sqrt(1-4*x))-(1-2*x)*(sqrt(1+4*x))+(sqrt(1-16*x^2)))/(4*x^2)");
  private final Series<Q> mS = SQ.multiply(SQ.shift(mD, 1), SQ.pow(mC, 3));

  @Override
  public Z next() {
    return mS.coeff(++mN).toZ();
  }
}
