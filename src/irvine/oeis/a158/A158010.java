package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158010 a(n) = 256*n^2 - n.
 * @author Sean A. Irvine
 */
public class A158010 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158010() {
    super(new long[] {1, -3, 3}, new long[] {255, 1022, 2301});
  }
}
