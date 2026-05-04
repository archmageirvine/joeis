package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395599 allocated for Amiram Eldar.
 * @author Sean A. Irvine
 */
public class A395599 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395599() {
    super(0, CR.THREE.log().divide(10).add(new Q(2, 15)));
  }
}

