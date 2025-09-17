package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388240 Decimal expansion of 3 * exp(-1/6 * Pi) * sqrt(2).
 * @author Sean A. Irvine
 */
public class A388240 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388240() {
    super(1, CR.PI.divide(-6).exp().multiply(3).multiply(CR.SQRT2));
  }
}
