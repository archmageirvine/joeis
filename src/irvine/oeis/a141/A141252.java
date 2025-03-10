package irvine.oeis.a141;
// Generated by gen_seq4.pl decsolv at 2021-07-31 13:37

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A141252 Decimal expansion of number c satisfying c*log(c)=1/2+c.
 * Equation; x*log(x)-(1/2+x)
 * @author Georg Fischer
 */
public class A141252 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A141252() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.multiply(x.log()).subtract(CR.HALF.add(x));
      }
    }.inverseMonotone(CR.valueOf(3.116), CR.valueOf(3.244)).execute(CR.ZERO));
  }
}
