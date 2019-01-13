package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033593.
 * @author Sean A. Irvine
 */
public class A033593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033593() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 0, 105, 880, 3465});
  }
}
