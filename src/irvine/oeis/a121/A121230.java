package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121230.
 * @author Sean A. Irvine
 */
public class A121230 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121230() {
    super(new long[] {-1, 1, -1, 1, 1, 1}, new long[] {0, 13, 5, 22, 42, 54});
  }
}
