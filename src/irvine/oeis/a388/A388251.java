package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388251 Decimal expansion of (1/4) * exp(3*Pi/8) * 2^(7/8).
 * @author Sean A. Irvine
 */
public class A388251 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388251() {
    super(1, CR.PI.multiply(new Q(3, 8)).exp().divide(4).multiply(CR.TWO.pow(new Q(7, 8))));
  }
}
