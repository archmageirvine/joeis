package irvine.oeis.a001;

import irvine.oeis.LinearRecurrence;

/**
 * A001973.
 * @author Sean A. Irvine
 */
public class A001973 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001973() {
    super(new long[] {-1, 2, 0, -1, -1, 0, 2}, new long[] {1, 1, 3, 5, 8, 12, 18});
  }
}
