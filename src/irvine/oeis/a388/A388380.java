package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388380 Decimal expansion of 4 * exp(-Pi / 2) * sqrt(2).
 * @author Sean A. Irvine
 */
public class A388380 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388380() {
    super(1, CR.HALF_PI.negate().exp().multiply(4).multiply(CR.SQRT2));
  }
}
