package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182067 a(n) = floor(n) - floor(n/2) - floor(n/3) - floor(n/5) + floor(n/30).
 * @author Sean A. Irvine
 */
public class A182067 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182067() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1});
  }
}
