package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048477.
 * @author Sean A. Irvine
 */
public class A048477 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048477() {
    super(new long[] {4, -8, 5}, new long[] {1, 7, 25});
  }
}
