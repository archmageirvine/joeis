package irvine.oeis.a392;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A392780 Positive integers whose maximal prime power divisors can be partitioned into two subsets of equal sum.
 * @author Sean A. Irvine
 */
public class A392780 extends CachedSequence {

  private static final SeriesRing<Z> SZ = SeriesRing.SZ;

  /** Construct the sequence. */
  public A392780() {
    super(1, Integer.class, (self, n) -> {
      if (n == 1) {
        return Z.ONE;
      }
      Z k = self.a(n - 1);
      while (true) {
        k = k.add(1);
        final FactorSequence fs = Jaguar.factor(k);
        Series<Z> series = SZ.one();
        Z s = Z.ZERO;
        for (final Z p : fs.toZArray()) {
          final Z pe = p.pow(fs.getExponent(p));
          s = s.add(pe);
          series = SZ.multiply(series, SZ.onePlusXToTheN(pe.intValueExact()));
        }
        if (s.isEven() && series.coeff(s.divide2().intValue()).signum() > 0) {
          return k;
        }
      }
    });
  }
}
