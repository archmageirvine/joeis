package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082116 Fibonacci sequence <code>(mod 5)</code>.
 * @author Sean A. Irvine
 */
public class A082116 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082116() {
    super(new long[] {1, 0, -1, 0, 1, -1, -1, 1, 1, -1, 0, 1, 0}, new long[] {0, 1, 1, 2, 3, 0, 3, 3, 1, 4, 0, 4, 4});
  }
}
