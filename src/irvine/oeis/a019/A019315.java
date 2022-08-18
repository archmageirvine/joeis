package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019315 Decimal expansion of e^Pi + Pi + e.
 * @author Sean A. Irvine
 */
public class A019315 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019315() {
    super(2, CR.PI.exp().add(CR.PI).add(CR.E));
  }
}
