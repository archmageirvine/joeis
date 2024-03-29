package irvine.oeis.a266;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A266749 G.f.: 1/((1-t^9)^2*(1-t)*(1-t^3)*(1-t^5)*(1-t^7)*(1-t^11)*(1-t^13)*(1-t^15)*(1-t^17)).
 * @author Georg Fischer
 */
public class A266749 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A266749() {
    super(0, new long[] {1},
      new long[] {1, -1, 0, -1, 1, -1, 1, -1, 2, -3, 3, -2, 4, -4, 4, -5, 6, 
      -7, 7, -7, 8, -10, 9, -10, 12, -14, 13, -14, 15, -16, 17, -16, 
      19, -20, 20, -19, 22, -22, 22, -22, 23, -25, 24, -23, 23, -26, 
      23, -23, 24, -25, 23, -22, 22, -22, 22, -19, 20, -20, 19, -16, 
      17, -16, 15, -14, 13, -14, 12, -10, 9, -10, 8, -7, 7, -7, 6, 
      -5, 4, -4, 4, -2, 3, -3, 2, -1, 1, -1, 1, -1, 0, -1, 1});
  }
}
