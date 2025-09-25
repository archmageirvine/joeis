package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389012 Decimal expansion of exp(Pi / 4) / (3^(3/8) * (2 * (1+sqrt(3)))^(1/6)).
 * @author Sean A. Irvine
 */
public class A389012 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389012() {
    super(1, CR.PI.divide(4).exp().divide(6).multiply(CR.TWO.pow(new Q(11, 12))).multiply(CR.THREE.pow(new Q(5, 8))).divide(CR.SQRT2.multiply(CR.ONE.add(CR.THREE.sqrt())).pow(new Q(1, 6))));
  }
}
