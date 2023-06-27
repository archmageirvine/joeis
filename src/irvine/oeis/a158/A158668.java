package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158668 a(n) = 58*n^2 - 1.
 * @author Sean A. Irvine
 */
public class A158668 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158668() {
    super(1, new long[] {1, -3, 3}, new long[] {57, 231, 521});
  }
}
