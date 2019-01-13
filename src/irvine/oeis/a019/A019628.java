package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019628.
 * @author Sean A. Irvine
 */
public class A019628 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019628() {
    super(new long[] {336, -160, 23}, new long[] {1, 23, 369});
  }
}
