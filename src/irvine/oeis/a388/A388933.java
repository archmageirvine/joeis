package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388933 Decimal expansion of ((-4+3 * sqrt(2))^(1/8) * exp((7 * Pi) / 24)) / 2.
 * @author Sean A. Irvine
 */
public class A388933 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388933() {
    super(1, CR.PI.multiply(new Q(7, 24)).exp().multiply(CR.TWO.pow(new Q(-1, 16))).divide(CR.SQRT2.multiply(CR.TWO.subtract(CR.SQRT2).sqrt()).sqrt()).divide(CR.SQRT2.multiply(CR.TWO.add(CR.SQRT2).sqrt()).sqrt()).divide((CR.TWO.add(CR.SQRT2)).pow(Q.ONE_QUARTER)));

  }
}
