package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388349 Decimal expansion of 8 * exp(-31*Pi/24) * 2^(7/8).
 * @author Sean A. Irvine
 */
public class A388349 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388349() {
    super(0, CR.PI.multiply(new Q(-31, 24)).exp().multiply(8).multiply(CR.TWO.pow(new Q(7, 8))));
  }
}
