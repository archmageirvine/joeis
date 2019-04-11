package irvine.oeis.a283;

import irvine.oeis.LinearRecurrence;

/**
 * A283457 Row <code>n=5</code> of A144048.
 * @author Sean A. Irvine
 */
public class A283457 extends LinearRecurrence {

  /** Construct the sequence. */
  public A283457() {
    super(new long[] {-720, 1764, -1624, 735, -175, 21}, new long[] {7, 24, 101, 477, 2411, 12729});
  }
}
