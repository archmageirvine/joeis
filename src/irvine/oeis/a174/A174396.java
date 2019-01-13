package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174396.
 * @author Sean A. Irvine
 */
public class A174396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174396() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 4, 5, 8, 10});
  }
}
