package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158563 a(n) = 32*n^2 - 1.
 * @author Sean A. Irvine
 */
public class A158563 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158563() {
    super(1, new long[] {1, -3, 3}, new long[] {31, 127, 287});
  }
}
