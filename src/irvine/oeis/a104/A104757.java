package irvine.oeis.a104;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A104757 Decimal expansion of solution to x^(9^x)=9.
 * Equation; x^(9^x)-(9)
 * @author Georg Fischer
 */
public class A104757 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A104757() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.pow(CR.NINE.pow(x)).subtract(CR.NINE);
      }
    }.inverseMonotone(CR.valueOf(1.155), CR.valueOf(1.203)).execute(CR.ZERO));
  }
}
