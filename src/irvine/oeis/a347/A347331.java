package irvine.oeis.a347;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A347329.
 * @author Sean A. Irvine
 */
public class A347331 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A347331() {
    super(CR.PI.pow(6).multiply(new Q(691, 676675)));
  }
}
