package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117868 Number of palindromes <code>(in</code> base 9) below <code>9^n</code>.
 * @author Sean A. Irvine
 */
public class A117868 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117868() {
    super(new long[] {-9, 9, 1}, new long[] {8, 16, 88});
  }
}
