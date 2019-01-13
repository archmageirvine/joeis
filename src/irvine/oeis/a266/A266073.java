package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266073.
 * @author Sean A. Irvine
 */
public class A266073 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266073() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 2, 4, 2});
  }
}
