package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134136 a(n) = 2*a(n-2) + 4*a(n-3), with initial terms 0, 1, 1.
 * @author Sean A. Irvine
 */
public class A134136 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134136() {
    super(new long[] {4, 2, 0}, new long[] {0, 1, 1});
  }
}
