package irvine.oeis.a056;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A056530 Sequence remaining after third round of Flavius Josephus sieve; remove every fourth term of A047241.
 * @author Georg Fischer
 */
public class A056530 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A056530() {
    super(1, new long[] {0, 1, 2, 4, 5},
      new long[] {1, -1, 0, -1, 1});
  }
}
