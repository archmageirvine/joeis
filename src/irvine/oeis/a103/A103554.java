package irvine.oeis.a103;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A103554 Decimal expansion of solution to x*9^x = 1.
 * Equation; x*9^x-(1)
 * @author Georg Fischer
 */
public class A103554 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A103554() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.multiply(CR.NINE.pow(x)).subtract(CR.ONE);
      }
    }.inverseMonotone(CR.valueOf(0.400), CR.valueOf(0.416)).execute(CR.ZERO));
  }
}
