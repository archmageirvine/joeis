package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121442.
 * @author Sean A. Irvine
 */
public class A121442 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121442() {
    super(new long[] {-1, 9, 1}, new long[] {1, 1, 9});
  }
}
