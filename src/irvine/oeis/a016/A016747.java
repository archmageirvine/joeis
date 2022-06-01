package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016747 a(n) = (2*n)^7.
 * @author Sean A. Irvine
 */
public class A016747 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016747() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 128, 16384, 279936, 2097152, 10000000, 35831808, 105413504});
  }
}
