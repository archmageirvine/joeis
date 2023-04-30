package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158397 a(n) = 729n + 1.
 * @author Sean A. Irvine
 */
public class A158397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158397() {
    super(new long[] {-1, 2}, new long[] {730, 1459});
  }
}
