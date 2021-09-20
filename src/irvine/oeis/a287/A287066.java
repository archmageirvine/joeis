package irvine.oeis.a287;
// manually morfps at 2021-09-20 11:20

import irvine.oeis.MorphismFixedPointSequence;

/**
 * A287066 Start with 1 and repeatedly substitute 0-&gt;01, 1-&gt;12, 2-&gt;0.
 * @author Georg Fischer
 */
public class A287066 extends MorphismFixedPointSequence {

  /** Construct the sequence. */
  public A287066() {
    super("1", "1200", "0->01, 1->12, 2->0");
  }
}
