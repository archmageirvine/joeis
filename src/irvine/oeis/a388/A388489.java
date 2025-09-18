package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388489 Decimal expansion of 64 * exp(-Pi).
 * @author Sean A. Irvine
 */
public class A388489 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388489() {
    super(1, CR.PI.negate().exp().multiply(64));
  }
}
