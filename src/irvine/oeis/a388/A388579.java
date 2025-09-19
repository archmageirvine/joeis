package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388579 Decimal expansion of 16 * exp(-Pi).
 * @author Sean A. Irvine
 */
public class A388579 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388579() {
    super(0, CR.PI.negate().exp().multiply(16));
  }
}
