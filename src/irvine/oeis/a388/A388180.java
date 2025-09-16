package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388180 Decimal expansion of 18 * exp(-Pi / 2) * sqrt(2).
 * @author Sean A. Irvine
 */
public class A388180 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388180() {
    super(1, CR.HALF_PI.negate().exp().multiply(18).multiply(CR.SQRT2));
  }
}
