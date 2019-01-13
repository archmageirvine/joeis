package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266395.
 * @author Sean A. Irvine
 */
public class A266395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266395() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 0, 0, 15});
  }
}
