package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082645 <code>a(n) = floor((2*n^2 + n - 4)/4)</code>.
 * @author Sean A. Irvine
 */
public class A082645 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082645() {
    super(new long[] {1, -2, 1, 0, -1, 2}, new long[] {-1, -1, 1, 4, 8, 12});
  }
}
