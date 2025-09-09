package irvine.oeis.a080;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002835;

/**
 * A080207 Let F(x) = 1 + x + 4x^2 + 9x^3 + ... = g.f. for A002835 (solid partitions restricted to two planes) and write F(x) = 1/Product_{n&gt;=1} (1-x^n)^a(n).
 * @author Sean A. Irvine
 */
public class A080207 extends Sequence0 {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private final Series<Q> mF = Series.create(new A002835());
  private Series<Q> mG = SQ.one();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final Series<Q> h = SQ.multiply(mF, mG);
    final Q c = h.coeff(mN);
    mG = SQ.multiply(mG, SQ.pow(SQ.oneMinusXToTheN(mN), c.toZ()));
    return c.toZ();
  }
}

