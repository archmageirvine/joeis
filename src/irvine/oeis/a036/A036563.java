package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036563.
 * @author Sean A. Irvine
 */
public class A036563 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036563() {
    super(new long[] {-2, 3}, new long[] {-2, -1});
  }
}
