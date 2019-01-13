package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085810.
 * @author Sean A. Irvine
 */
public class A085810 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085810() {
    super(new long[] {-1, -3, 4}, new long[] {1, 2, 5});
  }
}
