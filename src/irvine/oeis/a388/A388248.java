package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388248 Decimal expansion of (1/2) * exp(Pi / 4) * 2^(1/4).
 * @author Sean A. Irvine
 */
public class A388248 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388248() {
    super(1, CR.PI.divide(4).exp().divide(2).multiply(CR.TWO.pow(Q.ONE_QUARTER)));
  }
}
