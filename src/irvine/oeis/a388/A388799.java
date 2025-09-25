package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388799 Decimal expansion of (sqrt(2+sqrt(2)) * exp(-Pi/24)) / 2^(5/8).
 * @author Sean A. Irvine
 */
public class A388799 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388799() {
    super(1, CR.PI.divide(-24).exp().multiply(CR.TWO.pow(new Q(-5, 8))).multiply(CR.TWO.add(CR.SQRT2).sqrt()));
  }
}
