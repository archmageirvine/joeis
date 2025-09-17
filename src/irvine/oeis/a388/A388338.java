package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388338 Decimal expansion of 4 * exp(-19*Pi/24) * 2^(3/8).
 * @author Sean A. Irvine
 */
public class A388338 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388338() {
    super(0, CR.PI.multiply(new Q(-19, 24)).exp().multiply(CR.TWO.pow(new Q(19, 8))));
  }
}
