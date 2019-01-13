package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174500.
 * @author Sean A. Irvine
 */
public class A174500 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174500() {
    super(new long[] {1, 0, -5, 0, 5, 0}, new long[] {1, 2, 1, 12, 1, 50});
  }
}
