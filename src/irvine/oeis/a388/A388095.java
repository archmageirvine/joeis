package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388095 Decimal expansion of 1/2 * exp(1/4 * Pi).
 * @author Sean A. Irvine
 */
public class A388095 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388095() {
    super(1, CR.PI.divide(4).exp().divide(2));
  }
}
