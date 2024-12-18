package irvine.oeis.a230;
// Generated by gen_seq4.pl decsolv at 2021-07-29 21:53

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A230161 Decimal expansion of the positive real solution of the equation x^k-x-1=0. Case k=8.
 * Equation; x^k-x-1=0. Case k=8.
 * @author Georg Fischer
 */
public class A230161 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A230161() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.pow(8).subtract(x).subtract(CR.ONE);
      }
    }.inverseMonotone(CR.valueOf(1.074), CR.valueOf(1.118)).execute(CR.ZERO));
  }
}
