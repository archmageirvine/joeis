package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388237 Decimal expansion of (1/8) * exp(Pi).
 * @author Sean A. Irvine
 */
public class A388237 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388237() {
    super(1, CR.PI.exp().divide(8));
  }
}
