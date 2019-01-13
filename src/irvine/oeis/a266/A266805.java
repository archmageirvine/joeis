package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266805.
 * @author Sean A. Irvine
 */
public class A266805 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266805() {
    super(new long[] {1, -5, -15, 15, 5}, new long[] {-14, -90, -722, -4830, -33554});
  }
}
