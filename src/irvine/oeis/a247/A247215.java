package irvine.oeis.a247;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A247215 Integers k such that 3k+1 and 6k+1 are both squares.
 * @author Sean A. Irvine
 */
public class A247215 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247215() {
    super(new long[] {1, -35, 35}, new long[] {0, 8, 280});
  }
}
