package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388454 Decimal expansion of (1/4) * exp(Pi / 4) * 2^(3/4).
 * @author Sean A. Irvine
 */
public class A388454 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388454() {
    super(0, CR.PI.divide(4).exp().divide(4).multiply(CR.TWO.pow(new Q(3, 4))));
  }
}
