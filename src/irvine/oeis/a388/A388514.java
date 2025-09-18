package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388514 Decimal expansion of 8 * exp(-Pi / 2).
 * @author Sean A. Irvine
 */
public class A388514 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388514() {
    super(1, CR.HALF_PI.negate().exp().multiply(8));
  }
}
