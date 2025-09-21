package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388781 Decimal expansion of exp(-Pi/6) * 2^(7/8).
 * @author Sean A. Irvine
 */
public class A388781 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388781() {
    super(1, CR.PI.divide(-6).exp().multiply(CR.TWO.pow(new Q(7, 8))));
  }
}
