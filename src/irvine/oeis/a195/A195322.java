package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195322 a(n) = 20*n^2.
 * @author Sean A. Irvine
 */
public class A195322 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195322() {
    super(new long[] {1, -3, 3}, new long[] {0, 20, 80});
  }
}
