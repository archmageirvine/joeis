package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388403 Decimal expansion of 72 * exp(-Pi).
 * @author Sean A. Irvine
 */
public class A388403 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388403() {
    super(1, CR.PI.negate().exp().multiply(72));
  }
}
