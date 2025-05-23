package irvine.oeis.a199;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199791 Decimal expansion of x&gt;0 satisfying 3*x^2-2*x*cos(x)=3*sin(x).
 * Equation; 3*x^2-2*x*cos(x)-(3*sin(x))
 * @author Georg Fischer
 */
public class A199791 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A199791() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.THREE.multiply(x.square()).subtract(CR.TWO.multiply(x).multiply(x.cos())).subtract(CR.THREE.multiply(x.sin()));
      }
    }.inverseMonotone(CR.valueOf(1.084), CR.valueOf(1.128)).execute(CR.ZERO));
  }
}
