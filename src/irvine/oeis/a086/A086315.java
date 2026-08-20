package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A086315 Decimal expansion of constant theta appearing in the expected number of pair of twin vacancies in a digital tree.
 * @author Sean A. Irvine
 */
public class A086315 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A086315() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        CR s = CR.ZERO;
        Z p = Z.ONE;
        long k = 0;
        while (true) {
          ++k;
          final Z h = Z.ONE.shiftLeft(k).subtract(1);
          s = s.add(CR.valueOf(h).inverse());
          p = p.multiply(h);
          final Z t = Z.valueOf(k).shiftLeft(k * (k - 1) / 2 - precision);
          final Z u = s.divide(p).multiply(t).toZ();
          if (u.isZero()) {
            return sum;
          }
          sum = sum.add(u);
        }
      }
    });
  }
}
