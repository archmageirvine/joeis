package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274579.
 * @author Sean A. Irvine
 */
public class A274579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274579() {
    super(new long[] {1, -1, 0, 0, -1442, 1442, 0, 0, 1}, new long[] {0, 1, 7, 27, 540, 2002, 10660, 39501, 779247});
  }
}
