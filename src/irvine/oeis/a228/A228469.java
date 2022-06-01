package irvine.oeis.a228;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A228469 a(n) = 6*a(n-2) + a(n-4), where a(0) = 2, a(1) = 8, a(2) = 13, a(3) = 49.
 * @author Sean A. Irvine
 */
public class A228469 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228469() {
    super(new long[] {1, 0, 6, 0}, new long[] {2, 8, 13, 49});
  }
}
