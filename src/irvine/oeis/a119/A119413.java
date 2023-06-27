package irvine.oeis.a119;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A119413 16*n-12.
 * @author Sean A. Irvine
 */
public class A119413 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119413() {
    super(1, new long[] {-1, 2}, new long[] {4, 20});
  }
}
