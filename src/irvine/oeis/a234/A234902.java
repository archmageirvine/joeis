package irvine.oeis.a234;

import irvine.oeis.LinearRecurrence;

/**
 * A234902.
 * @author Sean A. Irvine
 */
public class A234902 extends LinearRecurrence {

  /** Construct the sequence. */
  public A234902() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {2, 9, 13, 17, 24, 26});
  }
}
