package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105370.
 * @author Sean A. Irvine
 */
public class A105370 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105370() {
    super(new long[] {-5, -10, -10, -5}, new long[] {1, -1, 1, -2});
  }
}
