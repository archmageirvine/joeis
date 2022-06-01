package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158382 a(n) = 625*n^2 + 2*n.
 * @author Sean A. Irvine
 */
public class A158382 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158382() {
    super(new long[] {1, -3, 3}, new long[] {627, 2504, 5631});
  }
}
