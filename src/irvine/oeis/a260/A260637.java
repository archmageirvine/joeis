package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260637.
 * @author Sean A. Irvine
 */
public class A260637 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260637() {
    super(new long[] {1, -3, 3}, new long[] {28, 35, 56});
  }
}
