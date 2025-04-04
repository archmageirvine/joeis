package irvine.oeis.a199;
// Generated by gen_seq4.pl decsolv at 2021-08-03 20:49

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199618 Decimal expansion of greatest x satisfying x^2+4*x*cos(x)=3*sin(x).
 * Equation; x^2+4*x*cos(x)-3*sin(x)
 * @author Georg Fischer
 */
public class A199618 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A199618() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.square().add(CR.FOUR.multiply(x).multiply(x.cos())).subtract(CR.THREE.multiply(x.sin()));
      }
    }.inverseMonotone(CR.valueOf(3.412), CR.valueOf(3.552)).execute(CR.ZERO));
  }
}
