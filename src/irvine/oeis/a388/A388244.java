package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388244 Decimal expansion of exp(Pi / 12) / 2^(1/4).
 * @author Sean A. Irvine
 */
public class A388244 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388244() {
    super(1, CR.PI.divide(12).exp().divide(2).multiply(CR.TWO.pow(new Q(3, 4))));
  }
}
