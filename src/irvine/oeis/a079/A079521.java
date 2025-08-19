package irvine.oeis.a079;

import java.util.ArrayList;
import java.util.List;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesParser;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079521 Triangular array related to tennis ball problem, read by rows.
 * @author Sean A. Irvine
 */
public class A079521 extends Sequence0 {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private int mN = 0;
  private int mM = -1;
  private final Series<Q> mC = SeriesParser.parse("(1-sqrt(1-4*x))/(2*x)");
  private final Series<Q> mD = SeriesParser.parse("(1-(1+2*x)*(sqrt(1-4*x))-(1-2*x)*(sqrt(1+4*x))+(sqrt(1-16*x^2)))/(4*x^2)");
  private final List<Series<Q>> mColumns = new ArrayList<>();

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    if (mM >= mColumns.size()) {
      mColumns.add(SQ.multiply(SQ.multiply(mD, SQ.pow(SQ.shift(mC, 1), mN)), SQ.add(SQ.shift(SQ.pow(mC, 3), 1), SQ.multiply(mC, Q.valueOf(2L * mN)))));
    }
    return mColumns.get(mM).coeff(mN).toZ();
  }
}
