package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388317 Decimal expansion of (1/16) * exp(9*Pi/8) * 2^(5/8).
 * @author Sean A. Irvine
 */
public class A388317 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388317() {
    super(1, CR.PI.multiply(new Q(9, 8)).exp().divide(16).multiply(CR.TWO.pow(new Q(5, 8))));
  }
}
