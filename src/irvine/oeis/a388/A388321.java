package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388321 Decimal expansion of (1/16) * exp(31*Pi/24) * 2^(1/8).
 * @author Sean A. Irvine
 */
public class A388321 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388321() {
    super(1, CR.PI.multiply(new Q(31, 24)).exp().divide(16).multiply(CR.TWO.pow(new Q(1, 8))));
  }
}
