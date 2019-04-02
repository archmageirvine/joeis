package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158585 a(n) = 289*n^2 + 17.
 * @author Sean A. Irvine
 */
public class A158585 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158585() {
    super(new long[] {1, -3, 3}, new long[] {17, 306, 1173});
  }
}
