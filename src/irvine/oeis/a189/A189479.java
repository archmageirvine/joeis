package irvine.oeis.a189;
// manually morfps at 2021-09-20

import irvine.oeis.base.MorphismFixedPointSequence;

/**
 * A189479 Fixed point starting with 0 of the morphism 0-&gt;01, 1-&gt;101.
 * @author Georg Fischer
 */
public class A189479 extends MorphismFixedPointSequence {

  /** Construct the sequence. */
  public A189479() {
    super("0", "0110", "0->01, 1->101");
  }
}
