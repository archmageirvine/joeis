package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022403.
 * @author Sean A. Irvine
 */
public class A022403 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022403() {
    super(new long[] {-1, 0, 2}, new long[] {3, 3, 7});
  }
}
