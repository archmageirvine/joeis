package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126978 a(n) = 104*n + 9977.
 * @author Sean A. Irvine
 */
public class A126978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126978() {
    super(new long[] {-1, 2}, new long[] {9977, 10081});
  }
}
