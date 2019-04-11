package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117860 Number of palindromes of length n (in base <code>8)</code>.
 * @author Sean A. Irvine
 */
public class A117860 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117860() {
    super(new long[] {8, 0}, new long[] {7, 7});
  }
}
