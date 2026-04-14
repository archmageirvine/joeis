package irvine.math.series;

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * Series corresponding to a Lerch transcendent.
 * @author Sean A. Irvine
 */
public class LerchPhi extends AbstractInfiniteSeries<Q> {

  // WARNING: This is not properly tested

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private final Series<Q> mLerchPhi;

  /**
   * Compute a Lerch transcendent series.
   * @param z series
   * @param s parameter
   * @param q parameter
   */
  public LerchPhi(final Series<Q> z, final long s, final Q q) {
    final Series<Q> z1 = SQ.subtract(SQ.one(), z);
    final Series<Q> c0 = SQ.divide(SQ.negate(z), z1);
    final Series<Q> sum = new AbstractInfiniteSeries<>() {
      private Series<Q> mSum = SQ.zero();
      private long mJ = -1;
      @Override
      public Q coeff(final long n) {
        while (n > mJ) {
          ++mJ;
          final Q innerSum = Rationals.SINGLETON.sum(0, mJ, k -> q.add(k).pow(-s).multiply(Z.NEG_ONE.pow(k).multiply(Binomial.binomial(mJ, k))));
          final Series<Q> term = SQ.multiply(SQ.pow(c0, mJ), innerSum);
          mSum = SQ.add(mSum, term);
        }
        return mSum.coeff(n);
      }
    };
    mLerchPhi = SQ.divide(sum, z1);
  }

  @Override
  public Q coeff(final long n) {
    return mLerchPhi.coeff(n);
  }
}
