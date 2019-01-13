package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077883.
 * @author Sean A. Irvine
 */
public class A077883 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077883() {
    super(new long[] {1, -2, 1, 1}, new long[] {1, 1, 2, 1});
  }
}
