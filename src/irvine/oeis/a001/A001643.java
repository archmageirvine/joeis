package irvine.oeis.a001;

import irvine.oeis.LinearRecurrence;

/**
 * A001643.
 * @author Sean A. Irvine
 */
public class A001643 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001643() {
    super(new long[] {1, 1, 1, 0, 1, 1}, new long[] {1, 3, 4, 11, 21, 42});
  }
}
