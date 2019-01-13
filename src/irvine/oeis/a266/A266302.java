package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266302.
 * @author Sean A. Irvine
 */
public class A266302 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266302() {
    super(new long[] {-16, 0, 17, 0}, new long[] {1, 6, 1, 126});
  }
}
