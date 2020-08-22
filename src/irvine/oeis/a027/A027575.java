package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027575 a(n) = n^2 + (n+1)^2 + (n+2)^2 + (n+3)^2.
 * @author Sean A. Irvine
 */
public class A027575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027575() {
    super(new long[] {1, -3, 3}, new long[] {14, 30, 54});
  }
}
