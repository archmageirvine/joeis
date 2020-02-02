package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195938 <code>a(n) = n/2</code> if <code>n mod 4 = 2, 0</code> otherwise.
 * @author Sean A. Irvine
 */
public class A195938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195938() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {0, 1, 0, 0, 0, 3, 0, 0});
  }
}
