package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086344 <code>a(n) = -2*a(n-1) + 4*a(n-2), a(0) = 1, a(1) = 0</code>.
 * @author Sean A. Irvine
 */
public class A086344 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086344() {
    super(new long[] {4, -2}, new long[] {1, 0});
  }
}
