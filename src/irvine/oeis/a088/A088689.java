package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088689 Jacobsthal numbers modulo 3.
 * @author Sean A. Irvine
 */
public class A088689 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088689() {
    super(new long[] {1, -1, 1, -1, 1}, new long[] {0, 1, 1, 0, 2});
  }
}
