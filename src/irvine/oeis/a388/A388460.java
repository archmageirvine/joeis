package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388460 Decimal expansion of exp(Pi / 24) / 2^(1/4).
 * @author Sean A. Irvine
 */
public class A388460 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388460() {
    super(0, CR.PI.divide(24).exp().multiply(CR.TWO.pow(new Q(-1, 4))));
  }
}
