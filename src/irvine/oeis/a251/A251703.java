package irvine.oeis.a251;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A251703 4-step Fibonacci sequence starting with 1,1,0,0.
 * @author Sean A. Irvine
 */
public class A251703 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251703() {
    super(new long[] {1, 1, 1, 1}, new long[] {1, 1, 0, 0});
  }
}
