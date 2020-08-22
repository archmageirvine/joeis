package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200999 Triangular numbers, T(m), that are four-thirds of another triangular number; T(m) such that 3*T(m) = 4*T(k) for some k.
 * @author Sean A. Irvine
 */
public class A200999 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200999() {
    super(new long[] {1, -195, 195}, new long[] {0, 28, 5460});
  }
}
