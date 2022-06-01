package irvine.oeis.a194;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A194715 15 times triangular numbers.
 * @author Sean A. Irvine
 */
public class A194715 extends LinearRecurrence {

  /** Construct the sequence. */
  public A194715() {
    super(new long[] {1, -3, 3}, new long[] {0, 15, 45});
  }
}
