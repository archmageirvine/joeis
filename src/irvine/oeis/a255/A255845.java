package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255845 a(n) = 2*n^2 + 10.
 * @author Sean A. Irvine
 */
public class A255845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255845() {
    super(new long[] {1, -3, 3}, new long[] {10, 12, 18});
  }
}
