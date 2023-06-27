package irvine.oeis.a075;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A075839 Numbers k such that 11*k^2 - 2 is a square.
 * @author Sean A. Irvine
 */
public class A075839 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075839() {
    super(1, new long[] {-1, 20}, new long[] {1, 19});
  }
}
