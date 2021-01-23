package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182754 a(1) = 1, a(2) = 21, a(n) = 77*a(n-2) for n&gt;=3.
 * @author Sean A. Irvine
 */
public class A182754 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182754() {
    super(new long[] {77, 0}, new long[] {1, 21});
  }
}
