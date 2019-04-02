package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109363 a(n) = 4*2^n - 3*n - 5.
 * @author Sean A. Irvine
 */
public class A109363 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109363() {
    super(new long[] {2, -5, 4}, new long[] {-1, 0, 5});
  }
}
