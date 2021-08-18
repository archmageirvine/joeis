package irvine.oeis.a347;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A347033 Decimal expansion of (5*exp(4)-1)/8.
 * @author Sean A. Irvine
 */
public class A347033 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A347033() {
    super(2, CR.FOUR.exp().multiply(CR.FIVE).subtract(CR.ONE).divide(CR.EIGHT));
  }
}
