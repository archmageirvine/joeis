package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388345 Decimal expansion of 8 * exp(-9*Pi/8) * 2^(3/8).
 * @author Sean A. Irvine
 */
public class A388345 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388345() {
    super(0, CR.PI.multiply(new Q(-9, 8)).exp().multiply(8).multiply(CR.TWO.pow(new Q(3, 8))));
  }
}
