package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195938 a(n) = n/2 if n mod 4 = 2, 0 otherwise.
 * @author Sean A. Irvine
 */
public class A195938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195938() {
    super(1, new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {0, 1, 0, 0, 0, 3, 0, 0});
  }
}
