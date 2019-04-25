package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117866 Number of palindromes <code>(in</code> base 7) below <code>7^n</code>.
 * @author Sean A. Irvine
 */
public class A117866 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117866() {
    super(new long[] {-7, 7, 1}, new long[] {6, 12, 54});
  }
}
