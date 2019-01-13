package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266873.
 * @author Sean A. Irvine
 */
public class A266873 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266873() {
    super(new long[] {-16, 0, 17, 0}, new long[] {1, 2, 21, 42});
  }
}
