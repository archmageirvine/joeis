package irvine.oeis.a194;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A194717 Number of n-ary words beginning with the first character of the alphabet, that can be built by inserting five doublets into the initially empty word.
 * @author Georg Fischer
 */
public class A194717 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A194717() {
    super(0, new long[] {0, -1, -121, -561, -311, -14},
      new long[] {-1, 5, -10, 10, -5, 1});
  }
}
