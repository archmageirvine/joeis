package irvine.oeis.a187;
// manually verified, 2023-04-29

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A187277 Let S denote the palindromes in the language {0,1,2,...,n-1}*; a(n) = number of words of length 4 in the language SS.
 * @author Georg Fischer
 */
public class A187277 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A187277() {
    super(1, new long[] {0, 1, 12, -1},
      new long[] {1, -4, 6, -4, 1});
  }
}
