package irvine.oeis.a089;

import irvine.oeis.FiniteSequence;

/**
 * A089474 Number of configurations of the sliding block 8-puzzle that require a minimum of n moves to be reached, starting with the empty square in the center.
 * @author Georg Fischer
 */
public class A089474 extends FiniteSequence {

  /** Construct the sequence. */
  public A089474() {
    super(1, 4, 8, 8, 16, 32, 60, 72, 136, 200, 376, 512, 964, 1296, 2368, 3084, 5482, 6736, 11132, 12208, 18612, 18444, 24968, 19632, 22289, 13600, 11842, 4340, 2398, 472, 148);
  }
}
