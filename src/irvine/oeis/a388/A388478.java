package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388478 Decimal expansion of (1/16) * exp(Pi).
 * @author Sean A. Irvine
 */
public class A388478 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388478() {
    super(1, CR.PI.exp().divide(16));
  }
}
