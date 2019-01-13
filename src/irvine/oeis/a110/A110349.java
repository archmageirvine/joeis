package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110349.
 * @author Sean A. Irvine
 */
public class A110349 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110349() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 5, 9, 18, 25});
  }
}
