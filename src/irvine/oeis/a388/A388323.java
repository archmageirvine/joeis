package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388323 Decimal expansion of exp(-Pi/12) * 2^(1/4).
 * @author Sean A. Irvine
 */
public class A388323 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388323() {
    super(0, CR.PI.divide(-12).exp().multiply(CR.TWO.pow(Q.ONE_QUARTER)));
  }
}
