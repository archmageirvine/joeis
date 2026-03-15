package irvine.oeis.a084;

import java.util.ArrayList;
import java.util.List;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393747.
 * @author Sean A. Irvine
 */
public class A084202 extends Sequence0 {

  private final List<Q> mA = new ArrayList<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(Q.ONE);
      return Z.ONE;
    }
    final int n = mA.size();
    final Series<Q> p = SeriesRing.SQ.square(Series.create(mA));
    final Z r = Q.ONE.subtract(p.coeff(n).divide(2)).floor();
    mA.add(new Q(r));
    return r;
  }
}
