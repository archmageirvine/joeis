package irvine.oeis.a127;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A127844 a(1) = 1, a(2) = ... = a(10) = 0, a(n) = a(n-10)+a(n-9) for n&gt;10.
 * @author Sean A. Irvine
 */
public class A127844 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127844() {
    super(new long[] {1, 1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
