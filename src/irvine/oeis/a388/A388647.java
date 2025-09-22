package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388647 Decimal expansion of exp(-Pi/8)*(1 + sqrt(5))/(2*2^(1/8)).
 * @author Sean A. Irvine
 */
public class A388647 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388647() {
    super(1, CR.PI.divide(-8).exp().divide(20).multiply(CR.TWO.pow(new Q(7, 8))).multiply(CR.FIVE.add(CR.FIVE.sqrt())).multiply(CR.FIVE.sqrt()));
  }
}
