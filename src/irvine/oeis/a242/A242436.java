package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242436 n^5 - 2n.
 * @author Sean A. Irvine
 */
public class A242436 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242436() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, -1, 28, 237, 1016, 3115});
  }
}
