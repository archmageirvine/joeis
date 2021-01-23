package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158603 a(n) = 441*n^2 + 21.
 * @author Sean A. Irvine
 */
public class A158603 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158603() {
    super(new long[] {1, -3, 3}, new long[] {21, 462, 1785});
  }
}
