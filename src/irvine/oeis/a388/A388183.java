package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388183 Decimal expansion of 2 * exp(-1/3 * Pi).
 * @author Sean A. Irvine
 */
public class A388183 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388183() {
    super(0, CR.PI.divide(-3).exp().multiply(2));
  }
}
