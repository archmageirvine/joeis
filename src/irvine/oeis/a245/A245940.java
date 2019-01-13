package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245940.
 * @author Sean A. Irvine
 */
public class A245940 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245940() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 0, 17, 279, 1960, 8875, 30555, 87122});
  }
}
