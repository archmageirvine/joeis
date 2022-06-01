package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158597 a(n) = 400*n^2 - 20.
 * @author Sean A. Irvine
 */
public class A158597 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158597() {
    super(new long[] {1, -3, 3}, new long[] {380, 1580, 3580});
  }
}
