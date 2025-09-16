package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388179 Decimal expansion of 32 * exp(-Pi).
 * @author Sean A. Irvine
 */
public class A388179 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388179() {
    super(1, CR.PI.negate().exp().multiply(32));
  }
}
