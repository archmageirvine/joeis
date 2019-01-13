package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113829.
 * @author Sean A. Irvine
 */
public class A113829 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113829() {
    super(new long[] {-4096, 4096, 0, 0, 0, 0, 1}, new long[] {1, 9, 25, 57, 185, 441, 4537});
  }
}
