package irvine.oeis.a222;

import irvine.oeis.LinearRecurrence;

/**
 * A222715.
 * @author Sean A. Irvine
 */
public class A222715 extends LinearRecurrence {

  /** Construct the sequence. */
  public A222715() {
    super(new long[] {-1, 3, 0, -8, 6, 6, -8, 0, 3}, new long[] {2, 14, 66, 198, 508, 1092, 2156, 3876, 6606});
  }
}
