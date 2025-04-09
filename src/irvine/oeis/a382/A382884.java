package irvine.oeis.a382;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A382884 Decimal expansion of 1/6 + Pi/(12*sqrt(3)) - log(3)/4.
 * @author Sean A. Irvine
 */
public class A382884 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A382884() {
    super(0, CR.PI.divide(CR.valueOf(432).sqrt()).add(new Q(1, 6)).subtract(CR.THREE.log().divide(4)));
  }
}
