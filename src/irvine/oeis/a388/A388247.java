package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388247 Decimal expansion of (1/2) * exp(5*Pi/24) * 2^(3/8).
 * @author Sean A. Irvine
 */
public class A388247 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388247() {
    super(1, CR.PI.multiply(new Q(5, 24)).exp().divide(2).multiply(CR.TWO.pow(new Q(3, 8))));
  }
}
