package irvine.oeis.a001;

import irvine.oeis.LinearRecurrence;

/**
 * A001635.
 * @author Sean A. Irvine
 */
public class A001635 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001635() {
    super(new long[] {1, 1, 1, 1, 0}, new long[] {0, 2, 3, 6, 10});
  }
}
