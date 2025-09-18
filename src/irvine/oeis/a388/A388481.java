package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388481 Decimal expansion of (1/4) * exp(Pi / 2).
 * @author Sean A. Irvine
 */
public class A388481 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388481() {
    super(1, CR.HALF_PI.exp().divide(4));
  }
}
