package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388181 Decimal expansion of 6 * exp(-Pi / 2) * sqrt(2).
 * @author Sean A. Irvine
 */
public class A388181 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388181() {
    super(1, CR.HALF_PI.negate().exp().multiply(6).multiply(CR.SQRT2));
  }
}
