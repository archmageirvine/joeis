package irvine.oeis.a117;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A117864 Number of palindromes (in base 5) below 5^n.
 * @author Sean A. Irvine
 */
public class A117864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117864() {
    super(new long[] {-5, 5, 1}, new long[] {4, 8, 28});
  }
}
