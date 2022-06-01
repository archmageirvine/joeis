package irvine.oeis.a271;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A271379 a(n) = 5^n mod 101.
 * @author Sean A. Irvine
 */
public class A271379 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271379() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 5, 25, 24, 19, 95, 71, 52, 58, 88, 36, 79, 92, 56, 78, 87, 31, 54, 68, 37, 84, 16, 80, 97, 81});
  }
}
