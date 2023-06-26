package irvine.oeis.a046;

import irvine.oeis.FiniteSequence;

/**
 * A046156 Limit set for operation of repeatedly replacing a number with the sum of the cubes of its digits.
 * @author Georg Fischer
 */
public class A046156 extends FiniteSequence {

  /** Construct the sequence. */
  public A046156() {
    super(1, FINITE, 0, 1, 55, 133, 136, 153, 160, 217, 244, 250, 352, 370, 371, 407, 919, 1459);
  }
}
