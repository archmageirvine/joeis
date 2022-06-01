package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158071 a(n) = 64*n + 1.
 * @author Sean A. Irvine
 */
public class A158071 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158071() {
    super(new long[] {-1, 2}, new long[] {65, 129});
  }
}
