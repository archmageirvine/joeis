package irvine.oeis.a163;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A163227 Fibonacci-accumulation sequence.
 * @author Sean A. Irvine
 */
public class A163227 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163227() {
    super(1, new long[] {-1, 0, 0, 0, 2, 0}, new long[] {1, 1, 1, 2, 2, 4});
  }
}
