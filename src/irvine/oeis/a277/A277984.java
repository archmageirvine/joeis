package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277984.
 * @author Sean A. Irvine
 */
public class A277984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277984() {
    super(new long[] {1, -3, 3}, new long[] {0, 24, 156});
  }
}
