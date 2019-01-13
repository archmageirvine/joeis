package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200752.
 * @author Sean A. Irvine
 */
public class A200752 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200752() {
    super(new long[] {1, -1, 3}, new long[] {1, 0, 0});
  }
}
