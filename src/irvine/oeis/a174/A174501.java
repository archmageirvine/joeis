package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174501.
 * @author Sean A. Irvine
 */
public class A174501 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174501() {
    super(new long[] {1, 0, -7, 0, 7, 0}, new long[] {1, 4, 1, 32, 1, 196});
  }
}
