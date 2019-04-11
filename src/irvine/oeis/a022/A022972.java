package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022972 <code>16-n</code>.
 * @author Sean A. Irvine
 */
public class A022972 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022972() {
    super(new long[] {-1, 2}, new long[] {16, 15});
  }
}
