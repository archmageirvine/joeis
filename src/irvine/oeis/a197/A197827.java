package irvine.oeis.a197;
// Generated by gen_seq4.pl decsolv at 2021-08-10 22:10

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A197827 Decimal expansion of least x &gt; 0 having sin(2*x) = 2*Pi*sin(4*Pi*x).
 * Equation; sin(2*x)-2*Pi*sin(4*Pi*x)
 * @author Georg Fischer
 */
public class A197827 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A197827() {
    super(0, new UnaryCrFunction() {
      @Override 
      public CR execute(final CR x) {
        return CR.TWO.multiply(x).sin().subtract(CR.TWO.multiply(CR.PI).multiply(CR.FOUR.multiply(CR.PI).multiply(x).sin()));
      }
    }.inverseMonotone(CR.valueOf(0.239), CR.valueOf(0.249)).execute(CR.ZERO));
  }
}
