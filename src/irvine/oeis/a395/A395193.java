package irvine.oeis.a395;

import irvine.math.predicate.Predicates;
import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesParser;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395193 Area of the n-th convex polyiamond formed by winding spirals of incrementing strips of polyiamonds.
 * @author Sean A. Irvine
 */
public class A395193 extends Sequence1 {

  private final Series<Q> mS = SeriesParser.parse("(x^3+x^4+x^6-x^7)/(1-x-x^2+x^4+x^5-x^6)");
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final Z c = mS.coeff(++mN).toZ();
      if (Predicates.TRIANGULAR.is(c)) {
        return c;
      }
    }
  }
}
