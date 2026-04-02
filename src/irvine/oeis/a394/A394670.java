package irvine.oeis.a394;

import java.util.ArrayList;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A394670 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A394670 extends Sequence0 {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private final ArrayList<Series<Q>> mColEgfs = new ArrayList<>();
  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    if (mM >= mColEgfs.size()) {
      mColEgfs.add(SQ.divide(SQ.one(), SQ.subtract(SQ.one(), SQ.divide(SQ.monomial(mM), SQ.oneMinusXToTheN(1)))));
    }
    return mColEgfs.get(mM).coeff(mN).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}
