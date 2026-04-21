package irvine.oeis.a385;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.series.Hypergeometric;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A385286 a(n) = (n!)^2 [x^n] hypergeom([], [1], x)^8.
 * @author Sean A. Irvine
 */
public class A385286 extends Sequence0 {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private final Series<Q> mS = SQ.pow(Hypergeometric.s(new Q[0], new Q[] {Q.ONE}, SQ.x()), 8);
  private long mN = -1;

  @Override
  public Z next() {
    return mS.coeff(++mN).multiply(Functions.FACTORIAL.z(mN).square()).toZ();
  }
}
