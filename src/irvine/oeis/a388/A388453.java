package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388453 Decimal expansion of exp(-Pi/12) * sqrt(2).
 * @author Sean A. Irvine
 */
public class A388453 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388453() {
    super(1, CR.PI.divide(-12).exp().multiply(CR.SQRT2));
  }
}
