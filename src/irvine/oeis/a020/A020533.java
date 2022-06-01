package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020533 a(n) = 7th Fibonacci polynomial evaluated at 2^n.
 * @author Sean A. Irvine
 */
public class A020533 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020533() {
    super(new long[] {-4096, 5440, -1428, 85}, new long[] {13, 169, 5473, 283009});
  }
}
