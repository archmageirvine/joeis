package irvine.oeis.a293;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A293156 Number of linear chord diagrams with n+2 chords such that every chord has length at least n.
 * @author Georg Fischer
 */
public class A293156 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A293156() {
    super(1, new long[] {0, -15, 9, 9, 5},
      new long[] {-1, 3});
  }
}
