package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022355 Fibonacci sequence beginning 0, 21.
 * @author Sean A. Irvine
 */
public class A022355 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022355() {
    super(new long[] {1, 1}, new long[] {0, 21});
  }
}
