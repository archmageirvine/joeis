package irvine.oeis.a079;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesParser;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079519 Related to tennis ball problem.
 * @author Sean A. Irvine
 */
public class A079519 extends Sequence0 {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private int mN = 0;
  private final Series<Q> mS1 = SeriesParser.parse("(1+(sqrt(1-4*x))-2*(sqrt(1-4*x))^2)*(1-(sqrt(1-4*x)))^5/(x^3*((sqrt(1-4*x))^2-(sqrt(1-4*x)))^2*(2+(sqrt(1-4*x))+(sqrt(1+4*x)))^2)");
  private final Series<Q> mS3 = SeriesParser.parse("4*(1-(sqrt(1-4*x)))^2*(1-(sqrt(1+4*x)))^2*((sqrt(1-4*x))^2-(1+2*x)*(sqrt(1-4*x))-(1-6*x)*(sqrt(1+4*x))+(sqrt(1-4*x))*(sqrt(1+4*x)))/(x^3*(2+(sqrt(1-4*x))+(sqrt(1+4*x)))^2*((sqrt(1+4*x))^2-(sqrt(1-4*x))-(sqrt(1+4*x))+(sqrt(1-4*x))*(sqrt(1+4*x)))^2)");
  private final Series<Q> mW = SQ.add(mS1, SQ.substitute(mS1, SQ.negate(SQ.x())), mS3, SQ.substitute(mS3, SQ.negate(SQ.x())));

  @Override
  public Z next() {
    mN += 2;
    return mW.coeff(mN).toZ().divide(4);
  }
}
