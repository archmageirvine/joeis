package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050685 Number of nonzero palindromes <code>&lt; 10^n</code> and containing at least one digit <code>'0'</code>.
 * @author Sean A. Irvine
 */
public class A050685 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050685() {
    super(new long[] {90, -90, -19, 19, 1}, new long[] {0, 0, 9, 18, 189});
  }
}
