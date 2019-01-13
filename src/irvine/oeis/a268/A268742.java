package irvine.oeis.a268;

import irvine.oeis.LinearRecurrence;

/**
 * A268742.
 * @author Sean A. Irvine
 */
public class A268742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268742() {
    super(new long[] {1, -1, 0, 0, -2, 2, 0, 0, 1}, new long[] {0, 1, 2, 20, 30, 31, 44, 98, 120});
  }
}
