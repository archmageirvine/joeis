package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019659 Decimal expansion of sqrt(Pi*e)/15.
 * @author Sean A. Irvine
 */
public class A019659 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019659() {
    super(CR.PI.multiply(CR.E).sqrt().divide(CR.valueOf(15)));
  }
}
