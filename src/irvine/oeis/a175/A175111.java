package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175111.
 * @author Sean A. Irvine
 */
public class A175111 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175111() {
    super(new long[] {-1, 5, -9, 5, 5, -9, 5}, new long[] {1, 121, 1563, 8403, 29525, 80525, 185647});
  }
}
