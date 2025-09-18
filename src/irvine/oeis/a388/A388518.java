package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388518 Decimal expansion of 2 * exp(-Pi/6).
 * @author Sean A. Irvine
 */
public class A388518 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388518() {
    super(1, CR.PI.divide(-6).exp().multiply(2));
  }
}
