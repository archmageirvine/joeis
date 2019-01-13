package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174239.
 * @author Sean A. Irvine
 */
public class A174239 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174239() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 0, 3, 1});
  }
}
