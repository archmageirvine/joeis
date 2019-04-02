package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255844 a(n) = 2*n^2 + 6.
 * @author Sean A. Irvine
 */
public class A255844 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255844() {
    super(new long[] {1, -3, 3}, new long[] {6, 8, 14});
  }
}
