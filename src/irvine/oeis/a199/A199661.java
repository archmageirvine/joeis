package irvine.oeis.a199;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199661 Decimal expansion of x&gt;0 satisfying 2*x^2+2*x*cos(x)=3*sin(x).
 * Equation; 2*x^2+2*x*cos(x)-(3*sin(x))
 * @author Georg Fischer
 */
public class A199661 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A199661() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.TWO.multiply(x.square()).add(CR.TWO.multiply(x).multiply(x.cos())).subtract(CR.THREE.multiply(x.sin()));
      }
    }.inverseMonotone(CR.valueOf(0.569), CR.valueOf(0.593)).execute(CR.ZERO));
  }
}
