package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388709 Decimal expansion of (1/16) * exp(5*Pi/8) * 2^(7/8).
 * @author Sean A. Irvine
 */
public class A388709 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388709() {
    super(0, CR.PI.multiply(new Q(5, 8)).exp().divide(16).multiply(CR.TWO.pow(new Q(7, 8))));
  }
}
