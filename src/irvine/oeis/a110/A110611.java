package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110611.
 * @author Sean A. Irvine
 */
public class A110611 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110611() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {1, 4, 11, 21, 37});
  }
}
