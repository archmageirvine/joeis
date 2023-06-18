package irvine.oeis.a347;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A347331 Decimal expansion of 691 * Pi^6 / 675675.
 * @author Sean A. Irvine
 */
public class A347331 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A347331() {
    super(0, CR.PI.pow(6).multiply(new Q(691, 675675)));
  }
}
