package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133754 a(n) = n^5 - n^3.
 * @author Sean A. Irvine
 */
public class A133754 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133754() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 0, 24, 216, 960, 3000});
  }
}
