package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051843 Partial sums of A002419.
 * @author Sean A. Irvine
 */
public class A051843 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051843() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 11, 51, 161, 406});
  }
}
