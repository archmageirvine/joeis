package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125758 Numbers congruent to 4 or <code>7 mod 9</code>.
 * @author Sean A. Irvine
 */
public class A125758 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125758() {
    super(new long[] {-1, 1, 1}, new long[] {4, 7, 13});
  }
}
