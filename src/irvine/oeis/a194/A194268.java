package irvine.oeis.a194;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A194268 a(n) = 8*n^2 + 7*n + 1.
 * @author Sean A. Irvine
 */
public class A194268 extends LinearRecurrence {

  /** Construct the sequence. */
  public A194268() {
    super(new long[] {1, -3, 3}, new long[] {1, 16, 47});
  }
}
