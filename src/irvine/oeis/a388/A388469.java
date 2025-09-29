package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388469 Decimal expansion of exp(Pi / 8) / 2^(5/8).
 * @author Sean A. Irvine
 */
public class A388469 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388469() {
    super(0, CR.PI.divide(8).exp().multiply(CR.TWO.pow(new Q(-5, 8))));
  }
}
