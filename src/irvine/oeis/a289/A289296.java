package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289296 a(n) = (n - 1)*(2*floor(n/2) + 1).
 * @author Sean A. Irvine
 */
public class A289296 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289296() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {-1, 0, 3, 6, 15});
  }
}
