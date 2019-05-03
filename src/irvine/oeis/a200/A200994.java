package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200994 Triangular numbers, <code>T(m)</code>, that are three-halves of another triangular number; <code>T(m)</code> such that <code>2*T(m) = 3*T(k)</code> for some k.
 * @author Sean A. Irvine
 */
public class A200994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200994() {
    super(new long[] {1, -99, 99}, new long[] {0, 15, 1485});
  }
}
