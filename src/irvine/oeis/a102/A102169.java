package irvine.oeis.a102;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A102169 a(n) = the number of sequences of n integers such that each integer is in the range 0..4 and the sum of the integers is in the range 0..24.
 * @author Georg Fischer
 */
public class A102169 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A102169() {
    super(1, new long[] {0, -5, 100, -1000, 6500, -30750, 111900, -325880, 776575, -1532975, 
      2533840, -3547700, 4251000, -4384980, 3894200, -2962780, 1915575, -1042375, 
      472300, -175980, 53060, -12650, 2300, -300, 25, -1},
      new long[] {-1, 25, -300, 2300, -12650, 53130, -177100, 480700, -1081575, 2042975, 
      -3268760, 4457400, -5200300, 5200300, -4457400, 3268760, -2042975, 
      1081575, -480700, 177100, -53130, 12650, -2300, 300, -25, 1});
  }
}
