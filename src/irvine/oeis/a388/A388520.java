package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388520 Decimal expansion of exp(-Pi/3) * 2^(1/3) * (sqrt(2) * (1+3^(1/2)))^(2/3).
 * @author Sean A. Irvine
 */
public class A388520 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388520() {
    super(1, CR.PI.divide(-3).exp().multiply(CR.TWO.pow(Q.ONE_THIRD)).multiply(CR.SQRT2.multiply(CR.ONE.add(CR.THREE.sqrt())).pow(new Q(2, 3))));
  }
}
