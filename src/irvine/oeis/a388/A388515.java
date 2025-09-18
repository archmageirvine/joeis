package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388515 Decimal expansion of 4 * exp(-Pi / 2).
 * @author Sean A. Irvine
 */
public class A388515 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388515() {
    super(0, CR.HALF_PI.negate().exp().multiply(4));
  }
}
