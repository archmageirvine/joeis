package irvine.oeis.a117;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A117863 Number of palindromes (in base 4) below 4^n.
 * @author Sean A. Irvine
 */
public class A117863 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117863() {
    super(new long[] {-4, 4, 1}, new long[] {3, 6, 18});
  }
}
