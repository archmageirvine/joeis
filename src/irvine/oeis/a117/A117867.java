package irvine.oeis.a117;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A117867 Number of palindromes (in base 8) below 8^n.
 * @author Sean A. Irvine
 */
public class A117867 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117867() {
    super(1, new long[] {-8, 8, 1}, new long[] {7, 14, 70});
  }
}
