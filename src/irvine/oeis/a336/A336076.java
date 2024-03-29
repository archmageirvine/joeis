package irvine.oeis.a336;
// Generated by gen_seq4.pl decexp at 2021-07-12 23:03

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A336076 Decimal expansion of (7*Pi + 2*sqrt(2)) / (Pi - 2*sqrt(2)).
 * @author Georg Fischer
 */
public class A336076 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A336076() {
    super(2, CR.SEVEN.multiply(CR.PI).add(CR.TWO.multiply(CR.TWO.sqrt())).divide(CR.PI.subtract(CR.TWO.multiply(CR.TWO.sqrt()))));
  }
}
