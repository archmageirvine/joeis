package irvine.oeis.a105;
// Generated by gen_seq4.pl decexp at 2021-07-18 19:09

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A105729 Decimal expansion of sqrt[3]*e^2/4: area of the regular triangle with side e.
 * Formula: sqrt(3)*e^2/4
 * @author Georg Fischer
 */
public class A105729 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A105729() {
    super(1, CR.THREE.sqrt().multiply(CR.E.pow(CR.TWO)).divide(CR.FOUR));
  }
}
