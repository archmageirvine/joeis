package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266504.
 * @author Sean A. Irvine
 */
public class A266504 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266504() {
    super(new long[] {1, 0, 2, 0}, new long[] {2, 2, 1, 3});
  }
}
