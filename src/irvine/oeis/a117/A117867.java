package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117867 Number of palindromes (in base 8) below <code>8^n</code>.
 * @author Sean A. Irvine
 */
public class A117867 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117867() {
    super(new long[] {-8, 8, 1}, new long[] {7, 14, 70});
  }
}
