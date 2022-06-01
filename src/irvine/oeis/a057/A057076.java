package irvine.oeis.a057;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A057076 A Chebyshev or generalized Fibonacci sequence.
 * @author Sean A. Irvine
 */
public class A057076 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057076() {
    super(new long[] {-1, 11}, new long[] {2, 11});
  }
}
