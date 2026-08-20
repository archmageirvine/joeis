package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A086317 Decimal expansion of asymptotic constant xi for counts of weakly binary trees.
 * @author Sean A. Irvine
 */
public class A086317 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A086317() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z c = Z.TWO;
        Z x = Z.ZERO;
        long n = 0;
        while (true) {
          ++n;
          c = c.square().add(2);
          final Z t = x;
          x = CR.valueOf(c).pow(CR.valueOf(Z.ONE.shiftLeft(n)).inverse()).getApprox(precision);
          if (x.equals(t)) {
            return t;
          }
        }
      }
    });
  }
}
