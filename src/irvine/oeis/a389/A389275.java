package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389275 Decimal expansion of Sum_{i&gt;=2} 1/(i^12 - i^6).
 * @author Sean A. Irvine
 */
public class A389275 extends DecimalExpansionSequence {

  private static final CR SQRT3 = CR.THREE.sqrt();

  /** Construct the sequence. */
  public A389275() {
    super(0, CR.valueOf(new Q(23, 12)).subtract(CR.PI.pow(6).divide(945)).subtract(CR.HALF_PI.multiply(SQRT3).tanh().multiply(CR.PI).divide(2).divide(SQRT3)));
  }
}
