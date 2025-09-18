package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388431 Decimal expansion of 24 * exp(-Pi).
 * @author Sean A. Irvine
 */
public class A388431 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388431() {
    super(1, CR.PI.negate().exp().multiply(24));
  }
}
