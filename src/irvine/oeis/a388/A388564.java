package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388564 Decimal expansion of exp(-Pi/8) * 2^(5/16) / (2-sqrt(2))^(1/4).
 * @author Sean A. Irvine
 */
public class A388564 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388564() {
    super(0, CR.PI.divide(-8).exp().multiply(CR.TWO.pow(new Q(5, 16))).divide(CR.TWO.subtract(CR.SQRT2).pow(Q.ONE_QUARTER)));
  }
}
