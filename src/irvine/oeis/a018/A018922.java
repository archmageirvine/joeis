package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018922.
 * @author Sean A. Irvine
 */
public class A018922 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018922() {
    super(new long[] {-1, 0, 0, 0, 2}, new long[] {8, 16, 31, 60, 116});
  }
}
