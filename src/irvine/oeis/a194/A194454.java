package irvine.oeis.a194;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A194454 a(n) = 12*n^2 + 2*n + 1.
 * @author Sean A. Irvine
 */
public class A194454 extends LinearRecurrence {

  /** Construct the sequence. */
  public A194454() {
    super(new long[] {1, -3, 3}, new long[] {1, 15, 53});
  }
}
