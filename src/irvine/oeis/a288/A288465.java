package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288465 a(n) = 2*a(n-1) - a(n-4), where a(0) = 2, a(1) = 4, a(2) = 6, a(3) = 10.
 * @author Sean A. Irvine
 */
public class A288465 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288465() {
    super(new long[] {-1, 0, 0, 2}, new long[] {2, 4, 6, 10});
  }
}
