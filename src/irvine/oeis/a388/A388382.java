package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388382 Decimal expansion of 8 * exp(-3*Pi/4) * 2^(3/4).
 * @author Sean A. Irvine
 */
public class A388382 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388382() {
    super(1, CR.PI.multiply(new Q(-3, 4)).exp().multiply(CR.TWO.pow(new Q(15, 4))));
  }
}
