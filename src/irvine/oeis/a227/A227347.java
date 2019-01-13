package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227347.
 * @author Sean A. Irvine
 */
public class A227347 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227347() {
    super(new long[] {-1, 2, 0, -1, -1, 0, 2}, new long[] {0, 3, 10, 23, 43, 73, 113});
  }
}
