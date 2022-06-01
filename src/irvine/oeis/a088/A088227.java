package irvine.oeis.a088;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A088227 Solutions x to x^n == 7 mod 13.
 * @author Sean A. Irvine
 */
public class A088227 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088227() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {2, 6, 7, 11, 15});
  }
}
