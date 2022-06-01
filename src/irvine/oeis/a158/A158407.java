package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158407 a(n) = 900*n + 1.
 * @author Sean A. Irvine
 */
public class A158407 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158407() {
    super(new long[] {-1, 2}, new long[] {901, 1801});
  }
}
