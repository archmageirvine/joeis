package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200994 Triangular numbers, T(m), that are three-halves of another triangular number; T(m) such that 2*T(m) = 3*T(k) for some k.
 * @author Sean A. Irvine
 */
public class A200994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200994() {
    super(new long[] {1, -99, 99}, new long[] {0, 15, 1485});
  }
}
