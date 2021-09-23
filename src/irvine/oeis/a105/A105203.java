package irvine.oeis.a105;
// manually morfps at 2021-09-23 19:58

import irvine.oeis.MorphismFixedPointSequence;

/**
 * A105203 Trajectory of 1 under the morphism f: 1-&gt;{1,2,1}, 2-&gt;{2,3,2}, 3-&gt;{3,1,3}.
 * @author Georg Fischer
 */
public class A105203 extends MorphismFixedPointSequence {

  /** Construct the sequence. */
  public A105203() {
    super("1", "1212", "1->121, 2->232, 3->313");
  }
}
