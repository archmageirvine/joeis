package irvine.oeis.a079;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A079583 a(n) = 3*2^n - n - 2.
 * @author Sean A. Irvine
 */
public class A079583 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079583() {
    super(new long[] {2, -5, 4}, new long[] {1, 3, 8});
  }
}
