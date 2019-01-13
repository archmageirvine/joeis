package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266508.
 * @author Sean A. Irvine
 */
public class A266508 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266508() {
    super(new long[] {-10, 1, 10}, new long[] {1, 11, 101});
  }
}
