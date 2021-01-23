package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098127 Fibonacci sequence with a(1) = 7 and a(2) = 26.
 * @author Sean A. Irvine
 */
public class A098127 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098127() {
    super(new long[] {1, 1}, new long[] {7, 26});
  }
}
