package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388341 Decimal expansion of 4 * exp(-11*Pi/12) * 2^(3/4).
 * @author Sean A. Irvine
 */
public class A388341 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388341() {
    super(0, CR.PI.multiply(new Q(-11, 12)).exp().multiply(CR.TWO.pow(new Q(11, 4))));
  }
}
