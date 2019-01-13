package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213502.
 * @author Sean A. Irvine
 */
public class A213502 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213502() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 4, 17, 47, 98});
  }
}
