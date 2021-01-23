package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108354 Expansion of 1/((1-x)^2(1+x^2)^2) in powers of x.
 * @author Sean A. Irvine
 */
public class A108354 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108354() {
    super(new long[] {-1, 2, -3, 4, -3, 2}, new long[] {1, 2, 1, 0, 2, 4});
  }
}
