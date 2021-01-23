package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070550 a(n) = a(n-1) + a(n-3) + a(n-4), starting with a(0..3) = 1, 2, 2, 3.
 * @author Sean A. Irvine
 */
public class A070550 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070550() {
    super(new long[] {1, 1, 0, 1}, new long[] {1, 2, 2, 3});
  }
}
