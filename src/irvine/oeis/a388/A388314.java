package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388314 Decimal expansion of (1/8) * exp(23*Pi/24) * 2^(1/8).
 * @author Sean A. Irvine
 */
public class A388314 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388314() {
    super(1, CR.PI.multiply(new Q(23, 24)).exp().divide(8).multiply(CR.TWO.pow(new Q(1, 8))));
  }
}
