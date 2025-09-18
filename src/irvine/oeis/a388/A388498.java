package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388498 Decimal expansion of (1/2) * 2^(5/12) * (sqrt(2) * (1+3^(1/2)))^(1/3).
 * @author Sean A. Irvine
 */
public class A388498 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388498() {
    super(1, CR.TWO.pow(new Q(-7, 12)).multiply(CR.SQRT2.multiply(CR.ONE.add(CR.THREE.sqrt())).pow(new Q(1, 3))));
  }
}
