package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388373 Decimal expansion of exp(-Pi/24) * 2^(3/8).
 * @author Sean A. Irvine
 */
public class A388373 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388373() {
    super(1, CR.PI.divide(-24).exp().multiply(CR.TWO.pow(new Q(3, 8))));
  }
}
