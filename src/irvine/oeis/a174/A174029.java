package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174029.
 * @author Sean A. Irvine
 */
public class A174029 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174029() {
    super(new long[] {-1, 0, 2, 0}, new long[] {3, 18, 21, 45});
  }
}
