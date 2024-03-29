package irvine.oeis.a298;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A298016 Coordination sequence of snub-632 tiling with respect to a hexavalent node.
 * @author Georg Fischer
 */
public class A298016 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A298016() {
    super(0, new long[] {1, 6, 12, 10, 12, 12, 1},
      new long[] {1, 0, 0, -2, 0, 0, 1});
  }
}
