package irvine.oeis.a091;
// Generated by gen_seq4.pl decexp at 2021-07-27 10:14

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A091343 Decimal expansion of Gamma(1/4)/(2*Pi^(3/4)).
 * Formula: Gamma(1/4)/(2*Pi^(3/4))
 * @author Georg Fischer
 */
public class A091343 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A091343() {
    super(0, CR.ONE.divide(CR.FOUR).gamma().divide(CR.TWO.multiply(CR.PI.pow(CR.THREE.divide(CR.FOUR)))));
  }
}
