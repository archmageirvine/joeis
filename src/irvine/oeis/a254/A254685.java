package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254685.
 * @author Sean A. Irvine
 */
public class A254685 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254685() {
    super(new long[] {-1, 0, 1, 1, 1}, new long[] {1, 1, 2, 4, 7});
  }
}
