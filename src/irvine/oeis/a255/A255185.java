package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255185.
 * @author Sean A. Irvine
 */
public class A255185 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255185() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 26});
  }
}
