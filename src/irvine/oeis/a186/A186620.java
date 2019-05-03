package irvine.oeis.a186;

import irvine.oeis.LinearRecurrence;

/**
 * A186620 Fibonacci sequence beginning <code>12, 25</code>.
 * @author Sean A. Irvine
 */
public class A186620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186620() {
    super(new long[] {1, 1}, new long[] {12, 25});
  }
}
