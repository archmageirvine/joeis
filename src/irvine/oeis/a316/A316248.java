package irvine.oeis.a316;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A316248 Decimal expansion of the greatest x such that 1/x + 1/(x+1) + 1/(x+2) = 3.
 * Equation; 1/x+1/(x+1)+1/(x+2)-(3)
 * @author Georg Fischer
 */
public class A316248 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A316248() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.ONE.divide(x).add(CR.ONE.divide(x.add(CR.ONE))).add(CR.ONE.divide(x.add(CR.TWO))).subtract(CR.THREE);
      }
    }.inverseMonotone(CR.valueOf(0.505), CR.valueOf(0.525)).execute(CR.ZERO));
  }
}
