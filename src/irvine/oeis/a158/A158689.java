package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158689 <code>a(n) = 66*n^2 + 1</code>.
 * @author Sean A. Irvine
 */
public class A158689 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158689() {
    super(new long[] {1, -3, 3}, new long[] {1, 67, 265});
  }
}
