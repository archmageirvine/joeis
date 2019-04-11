package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022395 Fibonacci sequence beginning <code>1, 25</code>.
 * @author Sean A. Irvine
 */
public class A022395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022395() {
    super(new long[] {1, 1}, new long[] {1, 25});
  }
}
