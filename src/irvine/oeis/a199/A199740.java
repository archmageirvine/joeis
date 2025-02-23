package irvine.oeis.a199;
// Generated by gen_seq4.pl decsolv at 2021-08-03 20:49

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199740 Decimal expansion of x&gt;0 satisfying 2*x^2-x*cos(x)=3*sin(x).
 * Equation; 2*x^2-x*cos(x)-3*sin(x)
 * @author Georg Fischer
 */
public class A199740 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A199740() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.TWO.multiply(x.square()).subtract(x.multiply(x.cos())).subtract(CR.THREE.multiply(x.sin()));
      }
    }.inverseMonotone(CR.valueOf(1.248), CR.valueOf(1.298)).execute(CR.ZERO));
  }
}
