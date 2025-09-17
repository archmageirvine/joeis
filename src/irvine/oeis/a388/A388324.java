package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388324 Decimal expansion of exp(-Pi/8) * 2^(3/8).
 * @author Sean A. Irvine
 */
public class A388324 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388324() {
    super(0, CR.PI.divide(-8).exp().multiply(CR.TWO.pow(new Q(3, 8))));
  }
}
