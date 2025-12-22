package irvine.oeis.a391;

import irvine.math.MemoryFunction1;
import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A391669 Triangle read by rows: T(n,k) is the number of binary strings of length n that contain exactly k runs of 1's of even length, 0 &lt;= k &lt;= floor((n+1)/3).
 * @author Sean A. Irvine
 */
public class A391669 extends Sequence0 {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private static final Series<Q> C1 = SQ.oneMinusXToTheN(2);
  private static final Series<Q> C2 = SQ.create(Q.ONE, Q.NEG_ONE, new Q(-2), Q.ONE);
  private int mN = 0;
  private int mM = -1;
  private final MemoryFunction1<Series<Q>> mGfs = new MemoryFunction1<>() {
    @Override
    protected Series<Q> compute(final int k) {
      return SQ.shift(SQ.divide(C1, SQ.pow(C2, k + 1)), 3 * k - 1);
    }
  };

  @Override
  public Z next() {
    if (3 * ++mM > mN + 1) {
      ++mN;
      mM = 0;
    }
    return mGfs.get(mM).coeff(mN).toZ();
  }
}
