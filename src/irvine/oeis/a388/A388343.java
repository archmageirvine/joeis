package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388343 Decimal expansion of 8 * exp(-25*Pi/24) * 2^(1/8).
 * @author Sean A. Irvine
 */
public class A388343 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388343() {
    super(0, CR.PI.multiply(new Q(-25, 24)).exp().multiply(8).multiply(CR.TWO.pow(new Q(1, 8))));
  }
}
