package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266072.
 * @author Sean A. Irvine
 */
public class A266072 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266072() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 1, 1, 5});
  }
}
