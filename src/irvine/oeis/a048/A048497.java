package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048497.
 * @author Sean A. Irvine
 */
public class A048497 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048497() {
    super(new long[] {4, -8, 5}, new long[] {1, 2, 8});
  }
}
