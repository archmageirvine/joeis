package irvine.oeis.a209;

import irvine.oeis.FiniteSequence;

/**
 * A209258 The original Josephus problem: 41 soldiers are arranged in a ring, and every third man is killed by his neighbor, until only the last person remains, who would kill himself. Sequence shows soldier killing order.
 * @author Georg Fischer
 */
public class A209258 extends FiniteSequence {

  /** Construct the sequence. */
  public A209258() {
    super(1, FINITE, 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 1, 5, 10, 14, 19, 23, 28, 32, 37, 41, 7, 13, 20, 26, 34, 40, 8, 17, 29, 38, 11, 25, 2, 22, 4, 35, 16, 31);
  }
}
