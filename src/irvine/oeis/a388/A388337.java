package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388337 Decimal expansion of 4 * exp(-3*Pi/4) * 2^(1/4).
 * @author Sean A. Irvine
 */
public class A388337 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388337() {
    super(0, CR.PI.multiply(new Q(-3, 4)).exp().multiply(4).multiply(CR.TWO.pow(Q.ONE_QUARTER)));
  }
}
