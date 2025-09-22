package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388821 Decimal expansion of exp(-Pi) * 2^(3/4) * (2+sqrt(2))^2.
 * @author Sean A. Irvine
 */
public class A388821 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388821() {
    super(0, CR.PI.negate().exp().multiply(CR.TWO.pow(new Q(3, 4))).multiply(CR.TWO.add(CR.SQRT2).square()));
  }
}
