package irvine.oeis.a198;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A198612 Decimal expansion of x &lt; 0 satisfying 2*x^2+4*x = 3*sin(x).
 * Equation; 2*x^2+4*x-3*sin(x)
 * @author Georg Fischer
 */
public class A198612 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A198612() {
    super(0, new UnaryCrFunction() {
      @Override
      public CR execute(final CR x) {
        return CR.TWO.multiply(x.square()).add(CR.FOUR.multiply(x)).subtract(CR.THREE.multiply(x.sin()));
      }
    }.inverseMonotone(CR.valueOf(-0.595), CR.valueOf(-0.572)).execute(CR.ZERO).negate());
  }
}
