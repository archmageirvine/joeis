package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065260.
 * @author Sean A. Irvine
 */
public class A065260 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065260() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {2, 4, 1, 8, 6, 12, 3, 16});
  }
}
