package irvine.oeis.a188;
// manually posins at 2021-09-24 09:16

import irvine.math.cr.CR;
import irvine.oeis.FilterPositionSequence;

/**
 * A188089 Positions of 0 in the zero-one sequence [nr+4r]-[nr]-[4r], where r=sqrt(3), n&gt;=1.
 * @author Georg Fischer
 */
public class A188089 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A188089() {
    super(1, new A188374(4, CR.THREE.sqrt()), 0);
  }
}
