package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388666 Decimal expansion of 2 * exp(-Pi / 4) * 2^(3/4).
 * @author Sean A. Irvine
 */
public class A388666 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388666() {
    super(1, CR.PI.divide(-4).exp().multiply(CR.TWO.pow(new Q(7, 4))));
  }
}
