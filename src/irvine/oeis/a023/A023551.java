package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023551 Self-convolution of natural numbers &gt;= 3.
 * @author Sean A. Irvine
 */
public class A023551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023551() {
    super(new long[] {-1, 4, -6, 4}, new long[] {9, 24, 46, 76});
  }
}
