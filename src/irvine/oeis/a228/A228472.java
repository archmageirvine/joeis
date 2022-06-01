package irvine.oeis.a228;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A228472 a(n) = 6*a(n-2) + a(n-4), where a(0) = 5, a(1) = 8, a(2) = 30, a(3) = 49.
 * @author Sean A. Irvine
 */
public class A228472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228472() {
    super(new long[] {1, 0, 6, 0}, new long[] {5, 8, 30, 49});
  }
}
