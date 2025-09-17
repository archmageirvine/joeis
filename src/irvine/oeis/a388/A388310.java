package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388310 Decimal expansion of (1/8) * exp(19*Pi/24) * 2^(5/8).
 * @author Sean A. Irvine
 */
public class A388310 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388310() {
    super(1, CR.PI.multiply(new Q(19, 24)).exp().divide(8).multiply(CR.TWO.pow(new Q(5, 8))));
  }
}
