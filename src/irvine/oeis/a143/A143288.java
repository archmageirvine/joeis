package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143288.
 * @author Sean A. Irvine
 */
public class A143288 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143288() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 1, 0, 0, 0, 0, 0, 0, -1, 2}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
  }
}
