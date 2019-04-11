package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050684 Number of nonzero palindromes <code>&lt; 10^n</code> and containing at least one digit '1'.
 * @author Sean A. Irvine
 */
public class A050684 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050684() {
    super(new long[] {-90, 0, 19, 0}, new long[] {1, 2, 20, 38});
  }
}
