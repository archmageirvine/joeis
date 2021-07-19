package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019616 Decimal expansion of Pi*e/8.
 * @author Sean A. Irvine
 */
public class A019616 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019616() {
    super(CR.PI.multiply(CR.E).divide(CR.EIGHT));
  }
}
