package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082117 Fibonacci sequence <code>(mod 6)</code>.
 * @author Sean A. Irvine
 */
public class A082117 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082117() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 1, 2, 3, 5, 2, 1, 3, 4, 1, 5, 0, 5, 5, 4, 3, 1, 4, 5, 3, 2, 5, 1});
  }
}
