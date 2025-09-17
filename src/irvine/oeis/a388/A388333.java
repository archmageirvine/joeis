package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388333 Decimal expansion of 2 * exp(-7*Pi/12) * 2^(3/4).
 * @author Sean A. Irvine
 */
public class A388333 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388333() {
    super(0, CR.PI.multiply(new Q(-7, 12)).exp().multiply(CR.TWO.pow(new Q(7, 4))));
  }
}
