package irvine.oeis.a142;

import irvine.oeis.LinearRecurrence;

/**
 * A142241 a(n) = 24*n + 14.
 * @author Sean A. Irvine
 */
public class A142241 extends LinearRecurrence {

  /** Construct the sequence. */
  public A142241() {
    super(new long[] {-1, 2}, new long[] {14, 38});
  }
}
