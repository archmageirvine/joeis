package irvine.oeis.a084;

import java.util.ArrayList;
import java.util.List;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A084210 G.f. A(x) defined by: A(x)^10 consists entirely of integer coefficients between 1 and 10 (A083950); A(x) is the unique power series solution with A(0)=1.
 * @author Sean A. Irvine
 */
public class A084210 extends Sequence0 {

  private final List<Q> mA = new ArrayList<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(Q.ONE);
      return Z.ONE;
    }
    final int n = mA.size();
    final Series<Q> p = SeriesRing.SQ.pow(Series.create(mA), 10);
    final Z r = Q.ONE.subtract(p.coeff(n).divide(10)).floor();
    mA.add(new Q(r));
    return r;
  }
}
