package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388249 Decimal expansion of (1/2) * exp(7*Pi/24) * 2^(1/8).
 * @author Sean A. Irvine
 */
public class A388249 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388249() {
    super(1, CR.PI.multiply(new Q(7, 24)).exp().divide(2).multiply(CR.TWO.pow(new Q(1, 8))));
  }
}
