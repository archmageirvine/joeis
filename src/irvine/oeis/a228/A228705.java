package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228705.
 * @author Sean A. Irvine
 */
public class A228705 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228705() {
    super(new long[] {-1, 4, -8, 12, -14, 12, -8, 4}, new long[] {1, 2, 4, 10, 19, 28, 40, 60});
  }
}
