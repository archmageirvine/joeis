package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017464 a(n) = (11*n + 6)^4.
 * @author Sean A. Irvine
 */
public class A017464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017464() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1296, 83521, 614656, 2313441, 6250000});
  }
}
