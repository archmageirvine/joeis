package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395600 allocated for Amiram Eldar.
 * @author Sean A. Irvine
 */
public class A395600 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395600() {
    super(0, CR.THREE.log().divide(2).subtract(Q.ONE_THIRD));
  }
}

