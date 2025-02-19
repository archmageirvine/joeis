package irvine.oeis.a196;
// Generated by gen_seq4.pl decsolv at 2021-08-09 22:50

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A196818 Decimal expansion of the least x&gt;0 satisfying 1/(1+x^2)=3*cos(x).
 * Equation; 1/(1+x^2)-(3*cos(x))
 * @author Georg Fischer
 */
public class A196818 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A196818() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.ONE.divide(CR.ONE.add(x.square())).subtract(CR.THREE.multiply(x.cos()));
      }
    }.inverseMonotone(CR.valueOf(1.435), CR.valueOf(1.493)).execute(CR.ZERO));
  }
}
