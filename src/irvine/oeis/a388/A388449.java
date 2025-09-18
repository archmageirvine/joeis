package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388449 Decimal expansion of exp(-Pi / 4) * 2^(3/8) * (2+sqrt(2))^(1/2).
 * @author Sean A. Irvine
 */
public class A388449 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388449() {
    super(1, CR.PI.divide(-4).exp().multiply(CR.TWO.pow(new Q(3, 8))).multiply(CR.TWO.add(CR.SQRT2).sqrt()));
  }
}
