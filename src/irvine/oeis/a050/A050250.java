package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050250 Number of nonzero palindromes less than <code>10^n</code>.
 * @author Sean A. Irvine
 */
public class A050250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050250() {
    super(new long[] {-10, 10, 1}, new long[] {9, 18, 108});
  }
}
