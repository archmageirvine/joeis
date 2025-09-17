package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388326 Decimal expansion of exp(-5*Pi/24) * 2^(5/8).
 * @author Sean A. Irvine
 */
public class A388326 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388326() {
    super(0, CR.PI.multiply(new Q(-5, 24)).exp().multiply(CR.TWO.pow(new Q(5, 8))));
  }
}
