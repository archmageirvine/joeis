package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037517.
 * @author Sean A. Irvine
 */
public class A037517 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037517() {
    super(new long[] {-8, 1, 0, 8}, new long[] {2, 16, 129, 1034});
  }
}
