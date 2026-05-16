package irvine.oeis.a393;

import irvine.math.q.Q;
import irvine.math.series.Hypergeometric;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393983 allocated for Alex Shvets.
 * @author Sean A. Irvine
 */
public class A393983 extends Sequence0 {

  private static final Z Z108 = Z.valueOf(108);
  private long mN = -1;
  private final Series<Q> mS = SeriesRing.SQ.pow(new Hypergeometric(new Q[] {new Q(1, 6), Q.ONE_THIRD}, new Q[] {Q.ONE}), 3);

  @Override
  public Z next() {
    return mS.coeff(++mN).multiply(Z108.pow(mN)).toZ();
  }
}
