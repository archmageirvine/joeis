package irvine.oeis.a141;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A141001 a(n) = number of different landings of a grasshopper after n hops.
 * @author Georg Fischer
 */
public class A141001 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A141001() {
    super(0, new long[] {1, -2, 2, -1, 0, 1, 1, -1, 2, -2, 0, 0, -1, 1},
      new long[] {1, -3, 4, -4, 3, -1});
  }
}
