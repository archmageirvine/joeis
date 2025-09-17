package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388330 Decimal expansion of 2 * exp(-5*Pi/12) * 2^(1/4).
 * @author Sean A. Irvine
 */
public class A388330 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388330() {
    super(0, CR.PI.multiply(new Q(-5, 12)).exp().multiply(2).multiply(CR.TWO.pow(Q.ONE_QUARTER)));
  }
}
