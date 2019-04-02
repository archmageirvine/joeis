package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158562 a(n) = 256*n^2 - 16.
 * @author Sean A. Irvine
 */
public class A158562 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158562() {
    super(new long[] {1, -3, 3}, new long[] {240, 1008, 2288});
  }
}
