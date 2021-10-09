package irvine.oeis.a145;
// manually decexp at 2021-07-16 22:36

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A145427 Decimal expansion of sum_{n=0..inf} (n!/(n+3)!)^2.
 * Formula: 1/4*Pi^2-39/16
 * @author Georg Fischer
 */
public class A145427 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A145427() {
    super(1, CR.PI.multiply(CR.PI).divide(CR.FOUR).subtract(CR.valueOf(39).divide(CR.valueOf(16))));
  }
}
