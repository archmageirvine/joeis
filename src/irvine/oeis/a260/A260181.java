package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260181 Numbers whose last digit is prime.
 * @author Sean A. Irvine
 */
public class A260181 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260181() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {2, 3, 5, 7, 12});
  }
}
