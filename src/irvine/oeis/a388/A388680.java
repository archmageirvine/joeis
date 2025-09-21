package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388680 Decimal expansion of (1/18) * exp(2*Pi/3) * 3^(1/2).
 * @author Sean A. Irvine
 */
public class A388680 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388680() {
    super(0, CR.PI.multiply(new Q(2, 3)).exp().divide(18).multiply(CR.THREE.sqrt()));
  }
}
