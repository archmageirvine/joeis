package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266846.
 * @author Sean A. Irvine
 */
public class A266846 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266846() {
    super(new long[] {-32, 16, 2}, new long[] {1, 6, 20});
  }
}
