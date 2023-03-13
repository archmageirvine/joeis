package irvine.oeis.a360;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A360807 allocated for Artur Jasinski.
 * @author Sean A. Irvine
 */
public class A360807 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A360807() {
    super(CR.valueOf(new Q(3, 4)).lnGamma().multiply(4).add(CR.GAMMA.divide(CR.TWO)).add(CR.TWO.log()).subtract(CR.PI.log().multiply(new Q(3, 2))));
  }
}
