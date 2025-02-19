package irvine.oeis.a199;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199440 Decimal expansion of x&gt;0 satisfying 2*x^2+x*sin(x)=3*cos(x).
 * Equation; 2*x^2+x*sin(x)-(3*cos(x))
 * @author Georg Fischer
 */
public class A199440 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A199440() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.TWO.multiply(x.square()).add(x.multiply(x.sin())).subtract(CR.THREE.multiply(x.cos()));
      }
    }.inverseMonotone(CR.valueOf(0.818), CR.valueOf(0.852)).execute(CR.ZERO));
  }
}
