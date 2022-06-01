package irvine.oeis.a200;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A200993 Triangular numbers, T(m), that are two-thirds of another triangular number; T(m) such that 3*T(m) = 2*T(k) for some k.
 * @author Sean A. Irvine
 */
public class A200993 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200993() {
    super(new long[] {1, -99, 99}, new long[] {0, 10, 990});
  }
}
