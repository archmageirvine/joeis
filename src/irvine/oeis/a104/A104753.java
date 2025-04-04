package irvine.oeis.a104;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A104753 Decimal expansion of solution to x^(5^x)=5.
 * Equation; x^(5^x)-(5)
 * @author Georg Fischer
 */
public class A104753 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A104753() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.pow(CR.FIVE.pow(x)).subtract(CR.FIVE);
      }
    }.inverseMonotone(CR.valueOf(1.218), CR.valueOf(1.268)).execute(CR.ZERO));
  }
}
