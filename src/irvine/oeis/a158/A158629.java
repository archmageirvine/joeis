package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158629 a(n) = 484*n^2 + 22.
 * @author Sean A. Irvine
 */
public class A158629 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158629() {
    super(new long[] {1, -3, 3}, new long[] {22, 506, 1958});
  }
}
