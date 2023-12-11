package irvine.oeis.a367;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A367702 Number of degree 4 vertices in the n-Menger sponge graph.
 * @author Georg Fischer
 */
public class A367702 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A367702() {
    // signature 32,-275,724,-480
    super(1, "[[0],[-480],[724],[-275],[32],[-1]]", "0,144,2784,57552", 0);
  }
}
