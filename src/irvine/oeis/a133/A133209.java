package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133209 a(n) = 4a(n-1) - 6a(n-2) + 4a(n-3), n &gt; 3; a(0) = 3, a(1) = 2, a(2) = a(3) = 0.
 * @author Sean A. Irvine
 */
public class A133209 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133209() {
    super(new long[] {4, -6, 4}, new long[] {3, 2, 0});
  }
}
