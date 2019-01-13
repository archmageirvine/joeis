package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097066.
 * @author Sean A. Irvine
 */
public class A097066 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097066() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 0, 2, 2});
  }
}
