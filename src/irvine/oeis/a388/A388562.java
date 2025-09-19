package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388562 Decimal expansion of (1/24) * exp(Pi).
 * @author Sean A. Irvine
 */
public class A388562 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388562() {
    super(0, CR.PI.exp().divide(24));
  }
}
