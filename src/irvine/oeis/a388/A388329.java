package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388329 Decimal expansion of 2 * exp(-3*Pi/8) * 2^(1/8).
 * @author Sean A. Irvine
 */
public class A388329 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388329() {
    super(0, CR.PI.multiply(new Q(-3, 8)).exp().multiply(2).multiply(CR.TWO.pow(new Q(1, 8))));
  }
}
