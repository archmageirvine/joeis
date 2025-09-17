package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388348 Decimal expansion of 8 * exp(-5*Pi/4) * 2^(3/4).
 * @author Sean A. Irvine
 */
public class A388348 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388348() {
    super(0, CR.PI.multiply(new Q(-5, 4)).exp().multiply(CR.TWO.pow(new Q(15, 4))));
  }
}
