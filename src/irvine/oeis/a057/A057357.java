package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057357 a(n) = floor(3*n/7).
 * @author Sean A. Irvine
 */
public class A057357 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057357() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 0, 0, 1, 1, 2, 2, 3});
  }
}
