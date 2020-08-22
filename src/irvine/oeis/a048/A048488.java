package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048488 a(n) = 6*2^n - 5.
 * @author Sean A. Irvine
 */
public class A048488 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048488() {
    super(new long[] {-2, 3}, new long[] {1, 7});
  }
}
