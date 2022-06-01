package irvine.oeis.a247;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A247917 Expansion of 1 / (1 + x - x^3) in powers of x.
 * @author Sean A. Irvine
 */
public class A247917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247917() {
    super(new long[] {1, 0, -1}, new long[] {1, -1, 1});
  }
}
