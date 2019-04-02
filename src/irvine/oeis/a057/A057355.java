package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057355 a(n) = floor(3*n/5).
 * @author Sean A. Irvine
 */
public class A057355 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057355() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 0, 1, 1, 2, 3});
  }
}
