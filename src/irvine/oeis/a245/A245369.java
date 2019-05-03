package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245369 Number of compositions of n into parts <code>3, 5</code> and 8.
 * @author Sean A. Irvine
 */
public class A245369 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245369() {
    super(new long[] {1, 0, 0, 1, 0, 1, 0, 0}, new long[] {1, 0, 0, 1, 0, 1, 1, 0});
  }
}
