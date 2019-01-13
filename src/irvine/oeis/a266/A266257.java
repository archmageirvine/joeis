package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266257.
 * @author Sean A. Irvine
 */
public class A266257 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266257() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 2, 4, 9, 11});
  }
}
