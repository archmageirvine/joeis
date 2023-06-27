package irvine.oeis.a072;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A072683 Numbers k such that the last digit of F(k) is 3 where F(k) is the k-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A072683 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072683() {
    super(1, new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 1}, new long[] {4, 7, 13, 26, 44, 46, 47, 53, 64});
  }
}
