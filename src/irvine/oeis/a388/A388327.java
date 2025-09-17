package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388327 Decimal expansion of exp(-Pi / 4) * 2^(3/4).
 * @author Sean A. Irvine
 */
public class A388327 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388327() {
    super(0, CR.PI.divide(-4).exp().multiply(CR.TWO.pow(new Q(3, 4))));
  }
}
