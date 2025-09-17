package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388378 Decimal expansion of 2 * exp(-Pi / 4) * 2^(1/4).
 * @author Sean A. Irvine
 */
public class A388378 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388378() {
    super(1, CR.PI.divide(-4).exp().multiply(2).multiply(CR.TWO.pow(Q.ONE_QUARTER)));
  }
}
