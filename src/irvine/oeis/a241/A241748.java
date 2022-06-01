package irvine.oeis.a241;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A241748 a(n) = n^2 + 12.
 * @author Sean A. Irvine
 */
public class A241748 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241748() {
    super(new long[] {1, -3, 3}, new long[] {12, 13, 16});
  }
}
