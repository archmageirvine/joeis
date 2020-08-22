package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226547 Number of squares in all tilings of a 4 X n rectangle using integer sided square tiles.
 * @author Sean A. Irvine
 */
public class A226547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226547() {
    super(new long[] {-1, -2, -1, 6, 10, 2, -11, -12, 2, 4}, new long[] {0, 4, 25, 98, 386, 1402, 4938, 16936, 57020, 189172});
  }
}
