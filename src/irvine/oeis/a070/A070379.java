package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070379 a(n) = 5^n mod 29.
 * @author Sean A. Irvine
 */
public class A070379 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070379() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 1}, new long[] {1, 5, 25, 9, 16, 22, 23, 28});
  }
}
