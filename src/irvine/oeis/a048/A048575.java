package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048575.
 * @author Sean A. Irvine
 */
public class A048575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048575() {
    super(new long[] {-1, 3}, new long[] {2, 5});
  }
}
