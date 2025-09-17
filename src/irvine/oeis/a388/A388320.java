package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388320 Decimal expansion of (1/16) * exp(5*Pi/4) * 2^(1/4).
 * @author Sean A. Irvine
 */
public class A388320 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388320() {
    super(1, CR.PI.multiply(new Q(5, 4)).exp().divide(16).multiply(CR.TWO.pow(Q.ONE_QUARTER)));
  }
}
