package irvine.oeis.a163;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A163663 a(0) = 0 and A059153(n-1) written in base 2 otherwise.
 * @author Sean A. Irvine
 */
public class A163663 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163663() {
    super(new long[] {-1000, 110}, new long[] {0, 100});
  }
}
