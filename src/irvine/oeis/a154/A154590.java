package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154590 2n^2+16n+6.
 * @author Sean A. Irvine
 */
public class A154590 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154590() {
    super(new long[] {1, -3, 3}, new long[] {24, 46, 72});
  }
}
