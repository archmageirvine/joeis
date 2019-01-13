package irvine.oeis.a071;

import irvine.oeis.LinearRecurrence;

/**
 * A071816.
 * @author Sean A. Irvine
 */
public class A071816 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071816() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 20, 141, 580, 1751, 4332});
  }
}
