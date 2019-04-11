package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135343 <code>a(n) = 3*a(n-1) + 4*a(n-2) - a(n-3) + 3*a(n-4) + 4*a(n-5)</code>.
 * @author Sean A. Irvine
 */
public class A135343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135343() {
    super(new long[] {4, 3, -1, 4, 3}, new long[] {1, 3, 12, 51, 205});
  }
}
