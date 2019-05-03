package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022378 Fibonacci sequence beginning <code>2, 32</code>.
 * @author Sean A. Irvine
 */
public class A022378 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022378() {
    super(new long[] {1, 1}, new long[] {2, 32});
  }
}
