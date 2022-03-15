package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239607 a(n) = (1-2*n^2)^2.
 * @author Sean A. Irvine
 */
public class A239607 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239607() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 1, 49, 289, 961});
  }
}
