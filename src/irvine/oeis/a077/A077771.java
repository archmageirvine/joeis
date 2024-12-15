package irvine.oeis.a077;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A077771 Decimal value of the ternary Champernowne constant.
 * @author Sean A. Irvine
 */
public class A077771 extends DecimalExpansionSequence {

  protected A077771(final int base) {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        if (precision >= 0) {
          return Z.ZERO;
        }
        final StringBuilder s = new StringBuilder();
        final int requiredLength = 1 - (int) (precision * Math.log(2) / Math.log(base));
        long k = 0;
        while (s.length() < requiredLength) {
          s.append(Long.toString(++k, base));
        }
        return CR.valueOf(new Z(s, base)).divide(Z.valueOf(base).pow(s.length())).getApprox(precision);
      }
    });
  }

  /** Construct the sequence. */
  public A077771() {
    this(3);
  }
}
