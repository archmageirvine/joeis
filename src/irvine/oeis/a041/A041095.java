package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041095.
 * @author Sean A. Irvine
 */
public class A041095 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041095() {
    super(new long[] {-1, 0, 0, 0, 178, 0, 0, 0}, new long[] {1, 2, 5, 12, 173, 358, 889, 2136});
  }
}
