package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388178 Decimal expansion of 8 * exp(-Pi).
 * @author Sean A. Irvine
 */
public class A388178 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388178() {
    super(0, CR.PI.negate().exp().multiply(8));
  }
}
