package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388312 Decimal expansion of (1/8) * exp(7*Pi/8) * 2^(3/8).
 * @author Sean A. Irvine
 */
public class A388312 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388312() {
    super(1, CR.PI.multiply(new Q(7, 8)).exp().divide(8).multiply(CR.TWO.pow(new Q(3, 8))));
  }
}
