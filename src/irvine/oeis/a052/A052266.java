package irvine.oeis.a052;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A052266 Number of 3 X n matrices over GF(3) under row and column permutations.
 * @author Georg Fischer
 */
public class A052266 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A052266() {
    super(0, new long[] {1, 0, 28, 140, 526, 1862, 5124, 11144, 21813, 37277, 53992, 68880, 
      79184, 79114, 68880, 53936, 37333, 21813, 11172, 5096, 1862, 518, 
      148, 28, 1},
      new long[] {1, -10, 36, -38, -79, 180, 124, -340, -675, 1074, 1824, -2322, 
      -3981, 2676, 9396, -2196, -17127, -1566, 24404, 12910, -30735, -27976, 
      29560, 42696, -16738, -54740, 0, 54740, 16738, -42696, -29560, 27976, 
      30735, -12910, -24404, 1566, 17127, 2196, -9396, -2676, 3981, 2322, 
      -1824, -1074, 675, 340, -124, -180, 79, 38, -36, 10, -1});
  }
}
