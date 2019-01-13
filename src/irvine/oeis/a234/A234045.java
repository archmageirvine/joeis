package irvine.oeis.a234;

import irvine.oeis.LinearRecurrence;

/**
 * A234045.
 * @author Sean A. Irvine
 */
public class A234045 extends LinearRecurrence {

  /** Construct the sequence. */
  public A234045() {
    super(new long[] {-1, -1, -1, -1, -1, -1}, new long[] {0, 0, 1, -1, -1, 1});
  }
}
