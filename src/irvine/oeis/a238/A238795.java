package irvine.oeis.a238;

import irvine.oeis.FiniteSequence;

/**
 * A238795 The unique set of eleven distinct positive odd numbers up to 105 the sum of whose reciprocals is 1.
 * @author Georg Fischer
 */
public class A238795 extends FiniteSequence {

  /** Construct the sequence. */
  public A238795() {
    super(1, FINITE, 3, 5, 7, 9, 11, 33, 35, 45, 55, 77, 105);
  }
}
