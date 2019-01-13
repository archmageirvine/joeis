package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005868.
 * @author Sean A. Irvine
 */
public class A005868 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005868() {
    super(new long[] {1, 0, -1, 0, -1, -1, 1, 1, 0, 1, 0}, new long[] {1, 0, 1, 0, 2, 0, 2, 0, 3, 0, 4});
  }
}

