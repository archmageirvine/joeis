package irvine.oeis.a086;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A086653 a(n) = 2^n + 3*n.
 * @author Sean A. Irvine
 */
public class A086653 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086653() {
    super(1, new long[] {2, -5, 4}, new long[] {5, 10, 17});
  }
}
