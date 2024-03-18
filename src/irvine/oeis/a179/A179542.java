package irvine.oeis.a179;
// manually 2024-03-17

import irvine.oeis.base.MorphismFixedPointSequence;

/**
 * A179542 Trajectory of 1 under the morphism 1-&gt;(1,2,3), 2-&gt;(1,2), 3-&gt;(1) related to the heptagon and A006356.
 * @author Georg Fischer
 */
public class A179542 extends MorphismFixedPointSequence {

  /** Construct the sequence. */
  public A179542() {
    super(0, "1", "triangle", "1->123, 2->12, 3->1");
  }
}
