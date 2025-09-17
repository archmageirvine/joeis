package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388344 Decimal expansion of 8 * exp(-13*Pi/12) * 2^(1/4).
 * @author Sean A. Irvine
 */
public class A388344 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388344() {
    super(0, CR.PI.multiply(new Q(-13, 12)).exp().multiply(8).multiply(CR.TWO.pow(Q.ONE_QUARTER)));
  }
}
