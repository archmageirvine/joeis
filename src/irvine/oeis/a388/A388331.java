package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388331 Decimal expansion of 2 * exp(-11*Pi/24) * 2^(3/8).
 * @author Sean A. Irvine
 */
public class A388331 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388331() {
    super(0, CR.PI.multiply(new Q(-11, 24)).exp().multiply(CR.TWO.pow(new Q(11, 8))));
  }
}
