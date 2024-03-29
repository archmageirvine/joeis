package irvine.oeis.a212;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A212589 Walks with n steps on the x-axis using steps {1,0,-1} and visiting no point more than twice.
 * @author Georg Fischer
 */
public class A212589 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A212589() {
    super(0, new long[] {-1, 0, -1, -1, 3, -2, -1, 1},
      new long[] {-1, 3, -2, -1, 2, -2, 1});
  }
}
