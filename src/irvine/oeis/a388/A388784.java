package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388784 Decimal expansion of (1/1024) * exp(2 * Pi).
 * @author Sean A. Irvine
 */
public class A388784 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388784() {
    super(0, CR.TAU.exp().divide(1024));
  }
}
