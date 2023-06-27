package irvine.oeis.a117;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A117865 Number of palindromes (in base 6) below 6^n.
 * @author Sean A. Irvine
 */
public class A117865 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117865() {
    super(1, new long[] {-6, 6, 1}, new long[] {5, 10, 40});
  }
}
