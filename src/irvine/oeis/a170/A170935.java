package irvine.oeis.a170;

import irvine.oeis.LinearRecurrence;

/**
 * A170935 b(n)*b(n+1), where b() = A000930().
 * @author Sean A. Irvine
 */
public class A170935 extends LinearRecurrence {

  /** Construct the sequence. */
  public A170935() {
    super(new long[] {-1, -1, 1, 3, 1, 1}, new long[] {1, 1, 2, 6, 12, 24});
  }
}
