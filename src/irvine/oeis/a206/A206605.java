package irvine.oeis.a206;

import irvine.oeis.LinearRecurrence;

/**
 * A206605 Fibonacci sequence beginning 14, 11.
 * @author Sean A. Irvine
 */
public class A206605 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206605() {
    super(new long[] {1, 1}, new long[] {14, 11});
  }
}
