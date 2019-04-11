package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022352 Fibonacci sequence beginning <code>0, 18</code>.
 * @author Sean A. Irvine
 */
public class A022352 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022352() {
    super(new long[] {1, 1}, new long[] {0, 18});
  }
}
