package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020535 a(n) = 9th Fibonacci polynomial evaluated at 2^n.
 * @author Sean A. Irvine
 */
public class A020535 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020535() {
    super(new long[] {1048576, -1396736, 371008, -23188, 341}, new long[] {34, 985, 98209, 18674305, 4413393409L});
  }
}
