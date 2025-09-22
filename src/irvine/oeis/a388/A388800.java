package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388800 Decimal expansion of (1/4) * exp(11*Pi/24) * 2^(3/8) * (2-sqrt(2))^(1/2).
 * @author Sean A. Irvine
 */
public class A388800 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388800() {
    super(1, CR.PI.multiply(new Q(11, 24)).exp().multiply(CR.TWO.pow(new Q(-13, 8))).multiply(CR.TWO.subtract(CR.SQRT2).sqrt()));
  }
}
