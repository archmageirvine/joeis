package irvine.oeis.a084;

import java.util.ArrayList;
import java.util.List;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A084211 G.f. A(x) defined by: A(x)^11 consists entirely of integer coefficients between 1 and 11 (A084066); A(x) is the unique power series solution with A(0)=1.
 * @author Sean A. Irvine
 */
public class A084211 extends Sequence0 {

  private final List<Q> mA = new ArrayList<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(Q.ONE);
      return Z.ONE;
    }
    final int n = mA.size();
    final Series<Q> p = SeriesRing.SQ.pow(Series.create(mA), 11);
    final Z r = Q.ONE.subtract(p.coeff(n).divide(11)).floor();
    mA.add(new Q(r));
    return r;
  }
}
