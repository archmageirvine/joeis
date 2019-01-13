package irvine.oeis.a208;

import irvine.oeis.LinearRecurrence;

/**
 * A208903.
 * @author Sean A. Irvine
 */
public class A208903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A208903() {
    super(new long[] {-8, 16, -6, -6, 5}, new long[] {0, 4, 12, 32, 76});
  }
}
