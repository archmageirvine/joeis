package irvine.oeis.a199;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199779 Decimal expansion of x&gt;0 satisfying 2*x^2-3*x*cos(x)=2*sin(x).
 * Equation; 2*x^2-3*x*cos(x)-(2*sin(x))
 * @author Georg Fischer
 */
public class A199779 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A199779() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.TWO.multiply(x.square()).subtract(CR.THREE.multiply(x).multiply(x.cos())).subtract(CR.TWO.multiply(x.sin()));
      }
    }.inverseMonotone(CR.valueOf(1.218), CR.valueOf(1.268)).execute(CR.ZERO));
  }
}
