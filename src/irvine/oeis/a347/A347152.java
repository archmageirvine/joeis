package irvine.oeis.a347;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A347152 Decimal expansion of 7 * Pi / 2.
 * @author Sean A. Irvine
 */
public class A347152 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A347152() {
    super(CR.PI.multiply(CR.SEVEN).divide(CR.TWO));
  }
}
