package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055007 Number of nonnegative integer 4 X 4 matrices with no zero rows or columns and with sum of elements equal to n.
 * @author Sean A. Irvine
 */
public class A055007 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055007() {
    super(new long[] {-1, 16, -120, 560, -1820, 4368, -8008, 11440, -12870, 11440, -8008, 4368, -1820, 560, -120, 16}, new long[] {1, 0, 0, 0, 24, 528, 4648, 26224, 112666, 401424, 1246000, 3476368, 8905432, 21266208, 47875272, 102482048});
  }
}
