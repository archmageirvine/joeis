package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A072907 Decimal expansion of the solution of equation log(2) - X/8 - exp(-3X/7) = 0 (4.251844....).
 * @author Sean A. Irvine
 */
public class A072907 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A072907() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.TWO.log().subtract(x.divide(8)).subtract(x.multiply(-3).divide(7).exp());
      }
    }.inverseMonotone(CR.valueOf(4.0), CR.valueOf(5.0)).execute(CR.ZERO));
  }
}
