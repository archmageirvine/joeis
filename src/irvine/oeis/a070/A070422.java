package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070422 a(n) = 7^n mod 39.
 * @author Sean A. Irvine
 */
public class A070422 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070422() {
    super(new long[] {1, 0, -1, 0, 1, 0, -1, 0, 1, 0}, new long[] {1, 7, 10, 31, 22, 37, 25, 19, 16, 34});
  }
}
