package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388328 Decimal expansion of exp(-7*Pi/24) * 2^(7/8).
 * @author Sean A. Irvine
 */
public class A388328 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388328() {
    super(0, CR.PI.multiply(new Q(-7, 24)).exp().multiply(CR.TWO.pow(new Q(7, 8))));
  }
}
