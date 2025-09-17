package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388255 Decimal expansion of (1/4) * exp(13*Pi/24) * 2^(3/8).
 * @author Sean A. Irvine
 */
public class A388255 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388255() {
    super(1, CR.PI.multiply(new Q(13, 24)).exp().divide(4).multiply(CR.TWO.pow(new Q(3, 8))));
  }
}
