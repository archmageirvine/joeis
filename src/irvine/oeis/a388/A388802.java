package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388802 Decimal expansion of 2 * exp(-Pi/3) * 2^(3/4).
 * @author Sean A. Irvine
 */
public class A388802 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388802() {
    super(1, CR.PI.divide(-3).exp().multiply(CR.TWO.pow(new Q(7, 4))));
  }
}
