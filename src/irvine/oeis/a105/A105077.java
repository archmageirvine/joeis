package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105077.
 * @author Sean A. Irvine
 */
public class A105077 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105077() {
    super(new long[] {-1, -1, 0, -1}, new long[] {-5, 0, 0, 4});
  }
}
