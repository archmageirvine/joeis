package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174784.
 * @author Sean A. Irvine
 */
public class A174784 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174784() {
    super(new long[] {-1, 0, 0, 0, 0, 0}, new long[] {0, 1, -1, 0, 1, 1});
  }
}
