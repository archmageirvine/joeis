package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388099 Decimal expansion of (1/8) * exp(3*Pi/4).
 * @author Sean A. Irvine
 */
public class A388099 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388099() {
    super(1, CR.PI.multiply(new Q(3, 4)).exp().divide(8));
  }
}
