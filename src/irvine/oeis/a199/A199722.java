package irvine.oeis.a199;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199722 Decimal expansion of x&gt;0 satisfying x^2-x*cos(x)=sin(x).
 * Equation; x^2-x*cos(x)-(sin(x))
 * @author Georg Fischer
 */
public class A199722 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A199722() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.square().subtract(x.multiply(x.cos())).subtract(x.sin());
      }
    }.inverseMonotone(CR.valueOf(1.150), CR.valueOf(1.196)).execute(CR.ZERO));
  }
}
