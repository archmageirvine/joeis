package irvine.oeis.a263;
// Generated by gen_seq4.pl decsolv at 2021-08-10 22:10

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A263357 Decimal expansion of the solution of x*(log(x)-1)/(log(x)+1) = 1.
 * Equation; x*(log(x)-1)/(log(x)+1)-(1)
 * @author Georg Fischer
 */
public class A263357 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A263357() {
    super(1, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return x.multiply(x.log().subtract(CR.ONE)).divide(x.log().add(CR.ONE)).subtract(CR.ONE);
      }
    }.inverseMonotone(CR.valueOf(4.586), CR.valueOf(4.774)).execute(CR.ZERO));
  }
}
