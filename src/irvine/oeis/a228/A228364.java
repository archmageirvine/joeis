package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228364.
 * @author Sean A. Irvine
 */
public class A228364 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228364() {
    super(new long[] {-1, -2, -1, 2, 2, 0}, new long[] {0, 0, 1, 2, 3, 6});
  }
}
