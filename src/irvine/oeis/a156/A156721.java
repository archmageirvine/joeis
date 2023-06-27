package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156721 a(n) = 57122*n^2 - 47320*n + 9801.
 * @author Sean A. Irvine
 */
public class A156721 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156721() {
    super(1, new long[] {1, -3, 3}, new long[] {19603, 143649, 381939});
  }
}
