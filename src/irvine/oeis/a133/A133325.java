package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133325 Numbers such that 2*X^2-82 is a square.
 * @author Sean A. Irvine
 */
public class A133325 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133325() {
    super(new long[] {-1, 0, 6, 0}, new long[] {7, 13, 29, 71});
  }
}
