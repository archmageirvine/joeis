package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143698.
 * @author Sean A. Irvine
 */
public class A143698 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143698() {
    super(new long[] {1, -3, 3}, new long[] {0, 12, 72});
  }
}
