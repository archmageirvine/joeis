package irvine.oeis.a010;

import irvine.oeis.LinearRecurrence;

/**
 * A010891 Inverse of 5th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A010891 extends LinearRecurrence {

  /** Construct the sequence. */
  public A010891() {
    super(new long[] {-1, -1, -1, -1}, new long[] {1, -1, 0, 0});
  }
}

