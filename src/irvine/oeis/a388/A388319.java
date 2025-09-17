package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388319 Decimal expansion of (1/16) * exp(29*Pi/24) * 2^(3/8).
 * @author Sean A. Irvine
 */
public class A388319 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388319() {
    super(1, CR.PI.multiply(new Q(29, 24)).exp().divide(16).multiply(CR.TWO.pow(new Q(3, 8))));
  }
}
