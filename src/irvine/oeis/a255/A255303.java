package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255303 a(n) = A255302(2^n - 1).
 * @author Sean A. Irvine
 */
public class A255303 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255303() {
    super(new long[] {4, 2, -6, 5}, new long[] {1, 4, 16, 60});
  }
}
