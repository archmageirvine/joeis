package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098531 Sum of fifth powers of first n Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A098531 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098531() {
    super(new long[] {-1, -7, 48, 20, -100, 32, 9}, new long[] {0, 1, 2, 34, 277, 3402, 36170});
  }
}
