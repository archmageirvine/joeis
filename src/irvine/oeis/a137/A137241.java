package irvine.oeis.a137;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A137241 Number triples (k,3-k,2-2k), concatenated for k=0, 1, 2, 3,...
 * @author Georg Fischer
 */
public class A137241 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A137241() {
    super(0, new long[] {0, 3, 2, 1, -4, -4},
      new long[] {1, 0, 0, -2, 0, 0, 1});
  }
}
