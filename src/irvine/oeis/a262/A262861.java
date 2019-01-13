package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262861.
 * @author Sean A. Irvine
 */
public class A262861 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262861() {
    super(new long[] {-10000, 0, 10001, 0}, new long[] {1, 101, 10001, 1011101});
  }
}
