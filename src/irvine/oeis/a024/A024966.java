package irvine.oeis.a024;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A024966 7 times triangular numbers: 7*n*(n+1)/2.
 * @author Sean A. Irvine
 */
public class A024966 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024966() {
    super(new long[] {1, -3, 3}, new long[] {0, 7, 21});
  }
}
