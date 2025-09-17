package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388342 Decimal expansion of 4 * exp(-23*Pi/24) * 2^(7/8).
 * @author Sean A. Irvine
 */
public class A388342 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388342() {
    super(0, CR.PI.multiply(new Q(-23, 24)).exp().multiply(CR.TWO.pow(new Q(23, 8))));
  }
}
