package irvine.oeis.a030;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A030132 Digital root of Fibonacci(n).
 * @author Georg Fischer
 */
public class A030132 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A030132() {
    super(0, new long[] {0, -1, -1, -2, -3, -5, -8, -4, -3, -7, -1, -8, -9, -8, -8, 
      -7, -6, -4, -1, -5, -6, -2, -8, -1, -9},
      new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
      0, 0, 0, 0, 0, 1});
  }
}
