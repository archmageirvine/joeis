package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245830.
 * @author Sean A. Irvine
 */
public class A245830 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245830() {
    super(new long[] {-1, 4, -6, 4}, new long[] {54, 243, 656, 1381});
  }
}
