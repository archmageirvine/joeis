package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091684 <code>a(n) = 0</code> if n is divisible by 3, otherwise <code>a(n) = n</code>.
 * @author Sean A. Irvine
 */
public class A091684 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091684() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {0, 1, 2, 0, 4, 5});
  }
}
