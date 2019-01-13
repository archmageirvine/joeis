package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254965.
 * @author Sean A. Irvine
 */
public class A254965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254965() {
    super(new long[] {1, -1, -22, 22, 1}, new long[] {1, 2, 13, 34, 275});
  }
}
