package irvine.oeis.a294;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A294301 Sum of the sixth powers of the parts in the partitions of n into two distinct parts.
 * @author Georg Fischer
 */
public class A294301 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A294301() {
    super(1, new long[] {0, 0, 0, 65, 665, 3705, 10241, 19630, 23246, 19630, 10486, 3705, 
      721, 65, 1},
      new long[] {1, -1, -7, 7, 21, -21, -35, 35, 35, -35, -21, 21, 7, -7, -1, 
      1});
  }
}
