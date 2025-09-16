package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388184 Decimal expansion of 648 * exp(-Pi).
 * @author Sean A. Irvine
 */
public class A388184 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388184() {
    super(1, CR.PI.negate().exp().multiply(648));
  }
}
