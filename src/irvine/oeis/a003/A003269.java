package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003269 a(n) = a(n-1) + a(n-4) with a(0) = 0, a(1) = a(2) = a(3) = 1.
 * @author Sean A. Irvine
 */
public class A003269 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003269() {
    super(new long[] {1, 0, 0, 1}, new long[] {0, 1, 1, 1});
  }
}
