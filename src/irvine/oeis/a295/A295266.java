package irvine.oeis.a295;

import irvine.oeis.FiniteSequence;

/**
 * A295266 Positive integers whose squares can be represented as the sum or difference of 3-smooth numbers.
 * @author Georg Fischer
 */
public class A295266 extends FiniteSequence {

  /** Construct the sequence. */
  public A295266() {
    super(1, FINITE, 1, 2, 3, 5, 7, 17);
  }
}
