package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077853.
 * @author Sean A. Irvine
 */
public class A077853 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077853() {
    super(new long[] {2, -2, -2, 3}, new long[] {1, 3, 7, 13});
  }
}
