package irvine.oeis.a199;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199171 Decimal expansion of x&gt;0 satisfying x^2+x*cos(x)=1.
 * Equation; x^2+x*cos(x)-(1)
 * @author Georg Fischer
 */
public class A199171 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A199171() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.square().add(x.multiply(x.cos())).subtract(CR.ONE);
      }
    }.inverseMonotone(CR.valueOf(0.671), CR.valueOf(0.699)).execute(CR.ZERO));
  }
}
