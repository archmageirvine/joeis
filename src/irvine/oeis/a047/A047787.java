package irvine.oeis.a047;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A047787 Decimal expansion of (-1)*Gamma'(1/3)/Gamma(1/3) where Gamma(x) denotes the Gamma function.
 * @author Sean A. Irvine
 */
public class A047787 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A047787() {
    super(CR.GAMMA.add(CR.THREE.log().multiply(new Q(3, 2))).add(CR.HALF_PI.divide(CR.THREE.sqrt())));
  }
}
