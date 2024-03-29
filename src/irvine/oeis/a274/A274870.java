package irvine.oeis.a274;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A274870 Number of set partitions of [n] into exactly six blocks such that all odd elements are in blocks with an odd index and all even elements are in blocks with an even index.
 * @author Georg Fischer
 */
public class A274870 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A274870() {
    super(6, new long[] {0, 0, 0, 0, 0, 0, -1},
      new long[] {-1, 3, 13, -39, -56, 168, 92, -276, -48, 144});
  }
}
