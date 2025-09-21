package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388707 Decimal expansion of exp(Pi / 12) * 2^(3/4).
 * @author Sean A. Irvine
 */
public class A388707 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388707() {
    super(1, CR.PI.divide(12).exp().multiply(CR.TWO.pow(new Q(3, 4))));
  }
}
