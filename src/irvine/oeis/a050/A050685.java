package irvine.oeis.a050;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A050685 Number of nonzero palindromes &lt; 10^n and containing at least one digit '0'.
 * @author Sean A. Irvine
 */
public class A050685 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050685() {
    super(new long[] {90, -90, -19, 19, 1}, new long[] {0, 0, 9, 18, 189});
  }
}
