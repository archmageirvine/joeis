package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108928 a(n) = 8*n^2 - 3.
 * @author Sean A. Irvine
 */
public class A108928 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108928() {
    super(new long[] {1, -3, 3}, new long[] {5, 29, 69});
  }
}
