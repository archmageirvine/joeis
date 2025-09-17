package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388336 Decimal expansion of 4 * exp(-17*Pi/24) * 2^(1/8).
 * @author Sean A. Irvine
 */
public class A388336 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388336() {
    super(0, CR.PI.multiply(new Q(-17, 24)).exp().multiply(4).multiply(CR.TWO.pow(new Q(1, 8))));
  }
}
