package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126364 Number of base 10 n-digit numbers with adjacent digits differing by one or less.
 * @author Sean A. Irvine
 */
public class A126364 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126364() {
    super(new long[] {-1, 6, 1, -10, 6}, new long[] {10, 28, 80, 230, 664});
  }
}
