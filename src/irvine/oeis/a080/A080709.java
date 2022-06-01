package irvine.oeis.a080;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A080709 Take sum of squares of digits of previous term, starting with 4.
 * @author Sean A. Irvine
 */
public class A080709 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080709() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {4, 16, 37, 58, 89, 145, 42, 20});
  }
}
