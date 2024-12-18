package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A073732 Decimal expansion of lim_{n -&gt; infinity} n*phi - Sum_{k=1..n} F(k+1)/F(k), where phi is the golden ratio and F(k) denotes the k-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A073732 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A073732() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z phi2 = CR.PHI.square().getApprox(precision);
        final Z one = CR.ONE.getApprox(precision);
        final Z o2 = CR.ONE.getApprox(2 * precision);
        Z sum = Z.ZERO;
        Z pk = one;
        long k = 0;
        while (true) {
          pk = pk.multiply(phi2).shiftRight(-precision);
          final Z v = o2.divide(pk.signedAdd((++k & 1) == 1, one));
          if (v.isZero()) {
            return sum;
          }
          sum = sum.signedAdd((k & 1) == 1, v);
        }
      }
    }.multiply(CR.FIVE.sqrt()));
  }
}
