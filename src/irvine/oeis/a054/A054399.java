package irvine.oeis.a054;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A054399 Decimal expansion of the constant Product_{i=1..inf} ((1-3/(2*(i+1)))^(1/2^i).
 * @author Sean A. Irvine
 */
public class A054399 extends DecimalExpansionSequence {

  static CR N = new CR() {
    @Override
    protected Z approximate(final int precision) {
      final Z one = CR.ONE.getApprox(precision);
      Z prod = one;
      if (precision < 0) {
        int k = 0;
        while (true) {
          ++k;
          final Z t = CR.ONE.subtract(CR.THREE.divide(CR.valueOf(2L * k + 2))).pow(CR.valueOf(Z.ONE.shiftLeft(k)).inverse()).getApprox(precision);
          if (one.equals(t)) {
            break;
          }
          prod = scale(prod.multiply(t), precision);
        }
      }
      return prod;
    }
  };

  /** Construct the sequence. */
  public A054399() {
    super(N);
  }
}
