package irvine.oeis.a117;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A117866 Number of palindromes (in base 7) below 7^n.
 * @author Sean A. Irvine
 */
public class A117866 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117866() {
    super(new long[] {-7, 7, 1}, new long[] {6, 12, 54});
  }
}
