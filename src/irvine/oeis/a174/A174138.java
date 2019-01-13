package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174138.
 * @author Sean A. Irvine
 */
public class A174138 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174138() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {5, 6, 7, 8, 9, 15, 16, 17, 18, 19, 30});
  }
}
