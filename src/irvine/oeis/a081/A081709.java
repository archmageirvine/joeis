package irvine.oeis.a081;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A081709 Decimal expansion of lim_{i-&gt;infinity} Product_{j=2..i} gamma(i+zeta(i+1))/gamma(i+zeta(i)).
 * @author Sean A. Irvine
 */
public class A081709 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A081709() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        int j = 1;
        while (true) {
          ++j;
          final Z t = Zeta.zeta(j + 1).add(j).lnGamma().subtract(Zeta.zeta(j).add(j).lnGamma()).getApprox(precision);
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    }.exp());
  }
}
