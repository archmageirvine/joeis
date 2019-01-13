package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143449.
 * @author Sean A. Irvine
 */
public class A143449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143449() {
    super(new long[] {2, 0, 0, 0, 0, 0, 1}, new long[] {1, 3, 5, 7, 9, 11, 13});
  }
}
