package irvine.oeis.a386;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A386405 allocated for Kelvin Voskuijl.
 * @author Sean A. Irvine
 */
public class A386405 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A386405() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        Z prod = one;
        long k = -1;
        while (true) {
          final Z t = one.divide(Functions.FACTORIAL.z(++k).pow(3));
          if (t.isZero()) {
            return prod;
          }
          prod = prod.multiply(one.add(t)).shiftRight(-precision);
        }
      }
    });
  }
}

