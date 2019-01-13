package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080663.
 * @author Sean A. Irvine
 */
public class A080663 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080663() {
    super(new long[] {1, -3, 3}, new long[] {2, 11, 26});
  }
}
