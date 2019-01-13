package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048474.
 * @author Sean A. Irvine
 */
public class A048474 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048474() {
    super(new long[] {4, -8, 5}, new long[] {1, 4, 13});
  }
}
