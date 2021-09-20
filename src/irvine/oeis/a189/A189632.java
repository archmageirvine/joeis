package irvine.oeis.a189;
// manually morfps at 2021-09-20

import irvine.oeis.MorphismFixedPointSequence;

/**
 * A189632 Fixed point starting with 0 of the morphism 0-&gt;001, 1-&gt;100.
 * @author Georg Fischer
 */
public class A189632 extends MorphismFixedPointSequence {

  /** Construct the sequence. */
  public A189632() {
    super("0", "0010", "0->001, 1->100");
  }
}
