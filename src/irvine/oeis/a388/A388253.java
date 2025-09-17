package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388253 Decimal expansion of (1/4) * exp(11*Pi/24) * 2^(5/8).
 * @author Sean A. Irvine
 */
public class A388253 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388253() {
    super(1, CR.PI.multiply(new Q(11, 24)).exp().divide(4).multiply(CR.TWO.pow(new Q(5, 8))));
  }
}
