package irvine.oeis.a230;
// Generated by gen_seq4.pl decsolv at 2021-07-29 21:53

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A230163 Decimal expansion of the positive real solution of the equation x^k-x-1=0. Case k=10.
 * Equation; x^k-x-1=0. Case k=10.
 * @author Georg Fischer
 */
public class A230163 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A230163() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.pow(10).subtract(x).subtract(CR.ONE);
      }
    }.inverseMonotone(CR.valueOf(1.053), CR.valueOf(1.097)).execute(CR.ZERO));
  }
}
