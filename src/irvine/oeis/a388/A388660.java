package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388660 Decimal expansion of exp(-Pi/6) * 2^(5/8).
 * @author Sean A. Irvine
 */
public class A388660 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388660() {
    super(0, CR.PI.divide(-6).exp().multiply(CR.TWO.pow(new Q(5, 8))));
  }
}
