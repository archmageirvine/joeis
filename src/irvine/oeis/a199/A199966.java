package irvine.oeis.a199;
// Generated by gen_seq4.pl decsolv at 2021-08-03 20:49

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199966 Decimal expansion of greatest x satisfying x^2 + 4*cos(x) = 4*sin(x).
 * Equation; x^2+4*cos(x)-4*sin(x)
 * @author Georg Fischer
 */
public class A199966 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A199966() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.square().add(CR.FOUR.multiply(x.cos())).subtract(CR.FOUR.multiply(x.sin()));
      }
    }.inverseMonotone(CR.valueOf(2.330), CR.valueOf(2.426)).execute(CR.ZERO));
  }
}
