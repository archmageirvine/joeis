package irvine.oeis.a360;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A360807 Decimal expansion of Sum_{m&gt;=1} 1/(1/4 + z(m)^2) where z(m) is the imaginary part of the m-th nontrivial zero of the Dirichlet beta function whose real part is 1/2.
 * @author Sean A. Irvine
 */
public class A360807 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A360807() {
    super(CR.valueOf(new Q(3, 4)).lnGamma().multiply(4).add(CR.GAMMA.divide(CR.TWO)).add(CR.TWO.log()).subtract(CR.PI.log().multiply(new Q(3, 2))));
  }
}
