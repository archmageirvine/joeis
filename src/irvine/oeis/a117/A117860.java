package irvine.oeis.a117;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A117860 Number of palindromes of length n (in base 8).
 * @author Sean A. Irvine
 */
public class A117860 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117860() {
    super(new long[] {8, 0}, new long[] {7, 7});
  }
}
