package irvine.oeis.a199;
// Generated by gen_seq4.pl decsolvn at 2021-08-03 20:49

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199603 Decimal expansion of least x satisfying x+3*cos(x)=0.
 * Equation; x^2+3*x*cos(x)
 * @author Georg Fischer
 */
public class A199603 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A199603() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.square().add(CR.THREE.multiply(x).multiply(x.cos()));
      }
    }.inverseMonotone(CR.valueOf(-1.193), CR.valueOf(-1.147)).execute(CR.ZERO).negate());
  }
}
