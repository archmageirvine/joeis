package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153703.
 * @author Sean A. Irvine
 */
public class A153703 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153703() {
    super(new long[] {-27, 54, -36, 10}, new long[] {1, 13, 94, 526});
  }
}
