package irvine.oeis.a214;
// manually holsig2/holos at 2023-08-08 18:53

import irvine.oeis.recur.PaddingSequence;

/**
 * A214674 Conway's subprime Fibonacci sequence.
 * @author Georg Fischer
 */
public class A214674 extends PaddingSequence {

  /** Construct the sequence. */
  public A214674() {
    super(1, "1, 1, 2, 3, 5, 4, 3, 7, 5, 6, 11, 17, 14, 31, 15, 23, 19, 21, 20, 41, 61, 51, 56, 107, 163, 135, 149, 142, 97, 239, 168, 37, 41, 39, 40, 79, 17", "43, 48, 13, 61, 37, 49, 43, 46, 89, 45, 67, 56, 41, 97, 69, 83, 76, 53");
  }
}
