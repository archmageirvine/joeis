package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099505 A transform of the Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A099505 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099505() {
    super(new long[] {-1, 0, 1, -2, 1, 1}, new long[] {0, 1, 1, 2, 1, 2});
  }
}
