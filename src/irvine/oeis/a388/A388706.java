package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388706 Decimal expansion of (1/4) * exp(Pi / 2) * 2^(1/4) * (2-sqrt(2))^(1/2).
 * @author Sean A. Irvine
 */
public class A388706 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388706() {
    super(1, CR.HALF_PI.exp().divide(4).multiply(CR.TWO.pow(Q.ONE_QUARTER)).multiply(CR.TWO.subtract(CR.SQRT2).sqrt()));
  }
}
