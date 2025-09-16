package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388182 Decimal expansion of 2 * exp(-Pi / 2) * sqrt(2).
 * @author Sean A. Irvine
 */
public class A388182 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388182() {
    super(0, CR.HALF_PI.negate().exp().multiply(2).multiply(CR.SQRT2));
  }
}
