package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388905 Decimal expansion of -(1/16) * exp(Pi) * (sqrt(2)-2).
 * @author Sean A. Irvine
 */
public class A388905 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388905() {
    super(0, CR.PI.exp().divide(-16).multiply(CR.SQRT2.subtract(2)));
  }
}
