package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388308 Decimal expansion of (1/8) * exp(17*Pi/24) * 2^(7/8).
 * @author Sean A. Irvine
 */
public class A388308 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388308() {
    super(1, CR.PI.multiply(new Q(17, 24)).exp().divide(8).multiply(CR.TWO.pow(new Q(7, 8))));
  }
}
