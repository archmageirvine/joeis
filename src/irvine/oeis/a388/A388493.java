package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388493 Decimal expansion of (1/64) * exp(Pi).
 * @author Sean A. Irvine
 */
public class A388493 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388493() {
    super(0, CR.PI.exp().divide(64));
  }
}
