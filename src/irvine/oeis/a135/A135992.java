package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135992 Positive Fibonacci numbers swapped in pairs.
 * @author Sean A. Irvine
 */
public class A135992 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135992() {
    super(new long[] {-1, 0, 3, 0}, new long[] {1, 1, 3, 2});
  }
}
