package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117864 Number of palindromes <code>(in</code> base 5) below <code>5^n</code>.
 * @author Sean A. Irvine
 */
public class A117864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117864() {
    super(new long[] {-5, 5, 1}, new long[] {4, 8, 28});
  }
}
