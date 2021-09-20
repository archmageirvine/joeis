package irvine.oeis.a344;
// manually morfps at 2021-09-20 11:20

import irvine.oeis.MorphismFixedPointSequence;

/**
 * A344893 Fixed point of the morphism 1-&gt;1321, 2-&gt;0021, 3-&gt;1300, 0-&gt;0000 starting from 1.
 * @author Georg Fischer
 */
public class A344893 extends MorphismFixedPointSequence {

  /** Construct the sequence. */
  public A344893() {
    super("1", "1321", "0->0000, 1->1321, 2->0021, 3->1300");
  }
}
