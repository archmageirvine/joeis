package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042005.
 * @author Sean A. Irvine
 */
public class A042005 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042005() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 12098, 0, 0, 0, 0, 0}, new long[] {1, 1, 11, 23, 241, 264, 11857, 12121, 133067, 278255, 2915617, 3193872});
  }
}
