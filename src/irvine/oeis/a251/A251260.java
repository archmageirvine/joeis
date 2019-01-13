package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251260.
 * @author Sean A. Irvine
 */
public class A251260 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251260() {
    super(new long[] {-1, 0, 2, 1, 0, -2, -2, 0, 1, 2, 0}, new long[] {1, 2, 3, 6, 8, 13, 16, 24, 28, 40, 45});
  }
}
