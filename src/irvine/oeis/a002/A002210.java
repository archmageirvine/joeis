package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A002210 Decimal expansion of Khintchine's constant.
 * @author Sean A. Irvine
 */
public class A002210 extends DecimalExpansionSequence {

  // sum_{n=1}^\infty {(\zeta(2n)-1)/(n)} * sum_{k=1}^{2n-1} (-)^{k+1}/k
  /** Scaled Khintchine value. */
  public static final CR SCALED_KHINTCHINE = new CR() {
    @Override
    protected Z approximate(final int precision) {
      if (precision >= 0) {
        return Z.ZERO;
      }
      Z sum = Zeta.zeta(2).subtract(CR.ONE).getApprox(precision);
      int k = 1;
      Q altHarmonic = Q.ONE;
      while (true) {
        ++k;
        altHarmonic = altHarmonic.add(new Q(Z.ONE, Z.TWO.multiply(1 - k).multiply(2L * k - 1)));
        final Z t = Zeta.zeta(2 * k).subtract(CR.ONE).multiply(altHarmonic.divide(k)).getApprox(precision);
        if (t.isZero()) {
          break;
        }
        sum = sum.add(t);
      }
      return sum;
    }
  };

  /** Construct the sequence. */
  public A002210() {
    // Computed using ln K_0 = (1/ln(2)) * sum_{n=1}^\infty {(\zeta(2n)-1)/(n)} * sum_{k=1}^{2n-1} (-)^{k+1}/k
    super(SCALED_KHINTCHINE.divide(CR.LOG2).exp());
  }
}
