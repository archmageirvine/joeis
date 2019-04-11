package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247215 Integers k such that <code>3k+1</code> and <code>6k+1</code> are both squares.
 * @author Sean A. Irvine
 */
public class A247215 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247215() {
    super(new long[] {1, -35, 35}, new long[] {0, 8, 280});
  }
}
