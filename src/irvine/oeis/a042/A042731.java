package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042731.
 * @author Sean A. Irvine
 */
public class A042731 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042731() {
    super(new long[] {-1, 0, 0, 0, 718, 0, 0, 0}, new long[] {1, 1, 11, 12, 707, 719, 7897, 8616});
  }
}
