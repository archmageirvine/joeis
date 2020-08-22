package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158645 a(n) = 729*n^2 + 27.
 * @author Sean A. Irvine
 */
public class A158645 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158645() {
    super(new long[] {1, -3, 3}, new long[] {27, 756, 2943});
  }
}
