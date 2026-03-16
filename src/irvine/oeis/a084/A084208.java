package irvine.oeis.a084;

import java.util.ArrayList;
import java.util.List;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A084208 G.f. A(x) defined by: A(x)^8 consists entirely of integer coefficients between 1 and 8 (A083948); A(x) is the unique power series solution with A(0)=1.
 * @author Sean A. Irvine
 */
public class A084208 extends Sequence0 {

  private final List<Q> mA = new ArrayList<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(Q.ONE);
      return Z.ONE;
    }
    final int n = mA.size();
    final Series<Q> p = SeriesRing.SQ.pow(Series.create(mA), 8);
    final Z r = Q.ONE.subtract(p.coeff(n).divide(8)).floor();
    mA.add(new Q(r));
    return r;
  }
}
