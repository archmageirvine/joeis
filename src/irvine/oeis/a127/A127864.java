package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127864.
 * @author Sean A. Irvine
 */
public class A127864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127864() {
    super(new long[] {2, 4, 1}, new long[] {1, 1, 5});
  }
}
