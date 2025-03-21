package irvine.oeis.a201;
// Generated by gen_seq4.pl decsolv at 2021-08-03 20:49

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A201584 Decimal expansion of greatest x satisfying 2*x^2 = csc(x) and 0&lt;x&lt;Pi.
 * Equation; 2*x^2-csc(x)
 * @author Georg Fischer
 */
public class A201584 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A201584() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.TWO.multiply(x.square()).subtract(x.sin().inverse());
      }
    }.inverseMonotone(CR.THREE, CR.valueOf(3.14)).execute(CR.ZERO));
  }
}
