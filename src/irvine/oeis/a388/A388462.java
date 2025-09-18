package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388462 Decimal expansion of exp(-Pi/8) * sqrt(2).
 * @author Sean A. Irvine
 */
public class A388462 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388462() {
    super(0, CR.PI.divide(-8).exp().multiply(CR.SQRT2));
  }
}
