package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072683 Last digit of F(n) is 3 where F(n) is the n-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A072683 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072683() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 1}, new long[] {4, 7, 13, 26, 44, 46, 47, 53, 64});
  }
}
