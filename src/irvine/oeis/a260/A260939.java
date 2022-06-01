package irvine.oeis.a260;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A260939 Thirteen primes in arithmetic progression with difference 60060 and minimal initial term.
 * @author Sean A. Irvine
 */
public class A260939 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260939() {
    super(new long[] {-1, 2}, new long[] {4943, 65003});
  }
}
