package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156735 a(n) = 57122*n^2 + 47320*n + 9801.
 * @author Sean A. Irvine
 */
public class A156735 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156735() {
    super(new long[] {1, -3, 3}, new long[] {9801, 114243, 332929});
  }
}
