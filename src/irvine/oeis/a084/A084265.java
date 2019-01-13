package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084265.
 * @author Sean A. Irvine
 */
public class A084265 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084265() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 2, 6, 9});
  }
}
