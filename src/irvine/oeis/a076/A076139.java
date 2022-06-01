package irvine.oeis.a076;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A076139 Triangular numbers that are one-third of another triangular number: T(m) such that 3*T(m) = T(k) for some k.
 * @author Sean A. Irvine
 */
public class A076139 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076139() {
    super(new long[] {1, -15, 15}, new long[] {0, 1, 15});
  }
}
