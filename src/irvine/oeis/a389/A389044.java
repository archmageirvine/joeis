package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389044 Decimal expansion of (1/32) * exp(7*Pi/8) * 2^(5/8).
 * @author Sean A. Irvine
 */
public class A389044 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389044() {
    super(0, CR.PI.multiply(new Q(7, 8)).exp().divide(32).multiply(CR.TWO.pow(new Q(5, 8))));
  }
}
