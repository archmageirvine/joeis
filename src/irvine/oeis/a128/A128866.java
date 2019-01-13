package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128866.
 * @author Sean A. Irvine
 */
public class A128866 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128866() {
    super(new long[] {1024, -1984, 1240, -310, 31}, new long[] {5, 405, 12005, 253125, 4617605});
  }
}
