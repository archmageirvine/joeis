package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388245 Decimal expansion of (1/2) * exp(Pi / 8) * 2^(5/8).
 * @author Sean A. Irvine
 */
public class A388245 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388245() {
    super(1, CR.PI.divide(8).exp().divide(2).multiply(CR.TWO.pow(new Q(5, 8))));
  }
}
