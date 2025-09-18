package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388507 Decimal expansion of 40 * exp(-Pi).
 * @author Sean A. Irvine
 */
public class A388507 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388507() {
    super(1, CR.PI.negate().exp().multiply(40));
  }
}
