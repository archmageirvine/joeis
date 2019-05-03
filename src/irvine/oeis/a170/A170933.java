package irvine.oeis.a170;

import irvine.oeis.LinearRecurrence;

/**
 * A170933 <code>a(n) = A000930(n) + A000930(n+3) + 4</code>.
 * @author Sean A. Irvine
 */
public class A170933 extends LinearRecurrence {

  /** Construct the sequence. */
  public A170933() {
    super(new long[] {-1, 1, -1, 2}, new long[] {7, 8, 9, 12});
  }
}
