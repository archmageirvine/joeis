package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061646 a(n) = 2*a(n-1) + 2*a(n-2) - a(n-3) with a(-1) = 1, a(0) = 1, a(1) = 1.
 * @author Sean A. Irvine
 */
public class A061646 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061646() {
    super(new long[] {-1, 2, 2}, new long[] {1, 1, 1});
  }
}
