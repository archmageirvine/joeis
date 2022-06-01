package irvine.oeis.a177;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A177412 Fibonacci sequence beginning 14831,41069.
 * @author Sean A. Irvine
 */
public class A177412 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177412() {
    super(new long[] {1, 1}, new long[] {14831, 41069});
  }
}
