package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212500.
 * @author Sean A. Irvine
 */
public class A212500 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212500() {
    super(new long[] {-5, 0, 10, 0}, new long[] {1, 4, 7, 36});
  }
}
