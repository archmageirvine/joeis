package irvine.oeis.a382;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A382821 Decimal expansion of (3/2) * (log(3) - 1).
 * @author Sean A. Irvine
 */
public class A382821 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A382821() {
    super(0, CR.THREE.log().subtract(1).multiply(new Q(3, 2)));
  }
}
