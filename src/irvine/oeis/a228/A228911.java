package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228911 a(n) = 9^n - 8*8^n + 28*7^n - 56*6^n + 70*5^n - 56*4^n + 28*3^n - 8*2^n + 1.
 * @author Sean A. Irvine
 */
public class A228911 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228911() {
    super(new long[] {362880, -1026576, 1172700, -723680, 269325, -63273, 9450, -870, 45}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 40320});
  }
}
