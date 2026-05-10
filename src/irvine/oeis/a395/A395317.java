package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395317 Decimal expansion of the number Sum_{j&gt;=1} p_j/10^j with p_j being the j-th prime.
 * @author Sean A. Irvine
 */
public class A395317 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395317() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        long p = 1;
        Z m = CR.ONE.getApprox(precision);
        Z sum = Z.ZERO;
        while (true) {
          p = Functions.NEXT_PRIME.l(p);
          final Z t = m.multiply(p).divide(10);
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
          m = m.divide(10);
        }
      }
    });
  }
}
