package irvine.oeis.a262;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A262482 Number of (n+3)X(1+3) 0..1 arrays with each row and column divisible by 13, read as a binary number with top and left being the most significant bits.
 * @author Sean A. Irvine
 */
public class A262482 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262482() {
    super(new long[] {-2, 3, -1, 0, 0, 0, -2, 3}, new long[] {2, 3, 5, 10, 20, 40, 79, 158});
  }
}
