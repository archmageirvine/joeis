package irvine.oeis.a199;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199064 Decimal expansion of x&gt;0 satisfying 2*x^2+sin(x)=2.
 * Equation; 2*x^2+sin(x)-(2)
 * @author Georg Fischer
 */
public class A199064 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A199064() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.TWO.multiply(x.square()).add(x.sin()).subtract(CR.TWO);
      }
    }.inverseMonotone(CR.valueOf(0.785), CR.valueOf(0.817)).execute(CR.ZERO));
  }
}
