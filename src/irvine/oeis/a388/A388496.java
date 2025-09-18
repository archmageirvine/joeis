package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388496 Decimal expansion of 4 * exp(-Pi/3).
 * @author Sean A. Irvine
 */
public class A388496 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388496() {
    super(1, CR.PI.divide(-3).exp().multiply(4));
  }
}
