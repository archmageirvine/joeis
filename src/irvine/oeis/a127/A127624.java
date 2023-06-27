package irvine.oeis.a127;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A127624 An 11th-order Fibonacci sequence: a(n) = a(n-1) + ... + a(n-11).
 * @author Sean A. Irvine
 */
public class A127624 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127624() {
    super(1, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}
