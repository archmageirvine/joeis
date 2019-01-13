package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143490.
 * @author Sean A. Irvine
 */
public class A143490 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143490() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {3, 4, 4, 4, 3, 3, 2, 2, 1, 1, 1, 2, 2});
  }
}
