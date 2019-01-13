package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266615.
 * @author Sean A. Irvine
 */
public class A266615 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266615() {
    super(new long[] {1, -1, -1, 1, -1, 1, 1}, new long[] {1, 1, 3, 6, 7, 15, 17});
  }
}
