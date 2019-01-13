package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266219.
 * @author Sean A. Irvine
 */
public class A266219 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266219() {
    super(new long[] {-10, 1, 10}, new long[] {1, 11, 110});
  }
}
