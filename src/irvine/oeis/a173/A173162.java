package irvine.oeis.a173;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A173162 Decimal expansion of the solution x to x^x=8.
 * Equation; x^x-(8)
 * @author Georg Fischer
 */
public class A173162 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A173162() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.pow(x).subtract(CR.EIGHT);
      }
    }.inverseMonotone(CR.valueOf(2.340), CR.valueOf(2.436)).execute(CR.ZERO));
  }
}
