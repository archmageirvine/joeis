package irvine.oeis.a085;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A085697 a(n) = T(n)^2, where T(n) = A000073(n) is the n-th tribonacci number.
 * @author Sean A. Irvine
 */
public class A085697 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085697() {
    super(new long[] {-1, 0, -1, 6, 3, 2}, new long[] {0, 0, 1, 1, 4, 16});
  }
}
