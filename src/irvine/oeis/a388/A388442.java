package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388442 Decimal expansion of 3 * exp(-Pi / 4) * 2^(3/4).
 * @author Sean A. Irvine
 */
public class A388442 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388442() {
    super(1, CR.PI.divide(-4).exp().multiply(3).multiply(CR.TWO.pow(new Q(3, 4))));
  }
}
