package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074503 a(n) = 1^n + 2^n + 7^n.
 * @author Sean A. Irvine
 */
public class A074503 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074503() {
    super(new long[] {14, -23, 10}, new long[] {3, 10, 54});
  }
}
