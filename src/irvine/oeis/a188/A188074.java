package irvine.oeis.a188;
// manually posins at 2021-09-24 09:16

import irvine.math.cr.CR;
import irvine.oeis.FilterPositionSequence;

/**
 * A188074 Positions of 1 in the zero-one sequence [nr]-[3r]-[nr-3r], where r=sqrt(3), n&gt;=1.
 * @author Georg Fischer
 */
public class A188074 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A188074() {
    super(1, new A188192(3, CR.THREE.sqrt()), 1);
  }
}
