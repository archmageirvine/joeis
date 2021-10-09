package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019609 Decimal expansion of Pi*e.
 * @author Sean A. Irvine
 */
public class A019609 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019609() {
    super(CR.PI.multiply(CR.E));
  }
}
