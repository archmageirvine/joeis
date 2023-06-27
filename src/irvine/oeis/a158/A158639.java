package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158639 a(n) = 676*n^2 - 26.
 * @author Sean A. Irvine
 */
public class A158639 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158639() {
    super(1, new long[] {1, -3, 3}, new long[] {650, 2678, 6058});
  }
}
