package irvine.oeis.a130;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A130137 Number of Fibonacci binary words of length n having no 0110 subword. A Fibonacci binary word is a binary word having no 00 subword.
 * @author Georg Fischer
 */
public class A130137 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A130137() {
    super(0, new long[] {1, 1, 0, 1},
      new long[] {1, -1, -1, 1, -1});
  }
}
