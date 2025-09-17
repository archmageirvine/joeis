package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388325 Decimal expansion of exp(-Pi/6) * sqrt(2).
 * @author Sean A. Irvine
 */
public class A388325 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388325() {
    super(0, CR.PI.divide(-6).exp().multiply(CR.SQRT2));
  }
}
