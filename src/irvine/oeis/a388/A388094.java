package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388094 Decimal expansion of 1/2 * exp(1/8 * Pi) * 2^(1/2).
 * @author Sean A. Irvine
 */
public class A388094 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388094() {
    super(1, CR.PI.divide(8).exp().divide(2).multiply(CR.SQRT2));
  }
}
