package irvine.oeis.a321;
// Generated by gen_seq4.pl decexp at 2021-07-25 17:16

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A321943 Decimal expansion of Ni_1 = (1/2)*(gamma - log(2*Pi)) + 1, where gamma is Euler's constant (or the Euler-Mascheroni constant).
 * Formula: (1/2)*(gamma-log(2*Pi))+1
 * @author Georg Fischer
 */
public class A321943 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A321943() {
    super(0, CR.ONE.divide(CR.TWO).multiply(CR.GAMMA.subtract(CR.TWO.multiply(CR.PI).log())).add(CR.ONE));
  }
}
