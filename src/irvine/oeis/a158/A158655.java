package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158655 a(n) = 729*n^2 - 27.
 * @author Sean A. Irvine
 */
public class A158655 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158655() {
    super(new long[] {1, -3, 3}, new long[] {702, 2889, 6534});
  }
}
