package irvine.oeis.a230;
// Generated by gen_seq4.pl decsolv at 2021-08-10 22:10

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A230160 Decimal expansion of the positive real solution of the equation x^k-x-1=0. Case k=7.
 * Equation; x^7-x-1
 * @author Georg Fischer
 */
public class A230160 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A230160() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.pow(7).subtract(x).subtract(CR.ONE);
      }
    }.inverseMonotone(CR.valueOf(1.090), CR.valueOf(1.134)).execute(CR.ZERO));
  }
}
