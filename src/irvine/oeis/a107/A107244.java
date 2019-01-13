package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107244.
 * @author Sean A. Irvine
 */
public class A107244 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107244() {
    super(new long[] {1, -1, 0, -2, 2, 0, -10, 5, 5, 20, -12, -8, 28, -8, -9, -67, 28, 14, 6, 4, 2, 3}, new long[] {0, 0, 0, 0, 0, 1, 2, 6, 22, 86, 342, 1366, 5335, 20960, 82464, 324528, 1277104, 5025200, 19770800, 77789489, 306071370, 1204272270});
  }
}
