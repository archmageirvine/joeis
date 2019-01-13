package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080006.
 * @author Sean A. Irvine
 */
public class A080006 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080006() {
    super(new long[] {-1, -1, -1, 0, 1, 3, 2, 2, 1, 0}, new long[] {1, 0, 1, 1, 3, 5, 8, 16, 27, 51});
  }
}
