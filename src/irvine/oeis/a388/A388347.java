package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388347 Decimal expansion of 8 * exp(-29*Pi/24) * 2^(5/8).
 * @author Sean A. Irvine
 */
public class A388347 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388347() {
    super(0, CR.PI.multiply(new Q(-29, 24)).exp().multiply(8).multiply(CR.TWO.pow(new Q(5, 8))));
  }
}
