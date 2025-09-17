package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388332 Decimal expansion of 2 * exp(-13*Pi/24) * 2^(5/8).
 * @author Sean A. Irvine
 */
public class A388332 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388332() {
    super(0, CR.PI.multiply(new Q(-13, 24)).exp().multiply(CR.TWO.pow(new Q(13, 8))));
  }
}
