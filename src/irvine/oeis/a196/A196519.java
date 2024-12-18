package irvine.oeis.a196;
// Generated by gen_seq4.pl decsolv at 2021-08-10 22:10

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A196519 Decimal expansion of the number x satisfying x*e^x=6.
 * Equation; x*e^x-(6)
 * @author Georg Fischer
 */
public class A196519 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A196519() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.multiply(CR.E.pow(x)).subtract(CR.SIX);
      }
    }.inverseMonotone(CR.valueOf(1.403), CR.valueOf(1.461)).execute(CR.ZERO));
  }
}
