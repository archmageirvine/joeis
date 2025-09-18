package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388463 Decimal expansion of 2 * exp(-Pi / 4).
 * @author Sean A. Irvine
 */
public class A388463 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388463() {
    super(0, CR.PI.divide(-4).exp().multiply(2));
  }
}
