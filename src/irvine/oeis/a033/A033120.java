package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033120.
 * @author Sean A. Irvine
 */
public class A033120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033120() {
    super(new long[] {-2, 1, 0, 2}, new long[] {1, 2, 5, 11});
  }
}
