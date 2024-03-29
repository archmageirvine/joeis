package irvine.oeis.a261;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A261486 Number of set partitions of [n] into exactly ten parts such that no part contains two elements with a circular distance less than three.
 * @author Georg Fischer
 */
public class A261486 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A261486() {
    super(10, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 6, 52, 204, 964, 2664, 8686, 
      16992, 42266, 54005, 116207, 71309, 166984, 48860, 40320, 40320},
      new long[] {1, -27, 294, -1842, 9225, -43239, 162686, -525462, 1718844, -4486208, 
      10577910, -27546786, 46610633, -93568527, 192937134, -135050390, 491618697, 
      -304664631, -23802512, -1485973704L, -1797694800L, -1509134768L, -547840512, 
      1935293184L, 1625702400L, 1625702400L});
  }
}
