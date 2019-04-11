package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158644 <code>a(n) = 52*n^2 + 1</code>.
 * @author Sean A. Irvine
 */
public class A158644 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158644() {
    super(new long[] {1, -3, 3}, new long[] {1, 53, 209});
  }
}
