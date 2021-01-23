package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061925 a(n) = ceiling(n^2/2) + 1.
 * @author Sean A. Irvine
 */
public class A061925 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061925() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 2, 3, 6});
  }
}
