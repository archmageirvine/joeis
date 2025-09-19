package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388605 Decimal expansion of (2/9) * exp(Pi / 3) * 3^(1/2).
 * @author Sean A. Irvine
 */
public class A388605 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388605() {
    super(1, CR.PI.divide(3).exp().multiply(new Q(2, 9)).multiply(CR.THREE.sqrt()));
  }
}
