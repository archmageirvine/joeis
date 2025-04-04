package irvine.oeis.a199;
// Generated by gen_seq4.pl decsolv at 2021-08-03 20:49

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199664 Decimal expansion of x &gt; 0 satisfying 3*x^2 + x*cos(x) = 3*sin(x).
 * Equation; 3*x^2+x*cos(x)-3*sin(x)
 * @author Georg Fischer
 */
public class A199664 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A199664() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.THREE.multiply(x.square()).add(x.multiply(x.cos())).subtract(CR.THREE.multiply(x.sin()));
      }
    }.inverseMonotone(CR.valueOf(0.652), CR.valueOf(0.679)).execute(CR.ZERO));
  }
}
