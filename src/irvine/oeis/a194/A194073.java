package irvine.oeis.a194;

import irvine.oeis.LinearRecurrence;

/**
 * A194073 a(n) = 1 + floor((3/4)*n^2).
 * @author Sean A. Irvine
 */
public class A194073 extends LinearRecurrence {

  /** Construct the sequence. */
  public A194073() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 4, 7, 13});
  }
}
