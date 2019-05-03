package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022402 Fibonacci sequence beginning <code>1, 32</code>.
 * @author Sean A. Irvine
 */
public class A022402 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022402() {
    super(new long[] {1, 1}, new long[] {1, 32});
  }
}
