package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022129 Fibonacci sequence beginning <code>3, 20</code>.
 * @author Sean A. Irvine
 */
public class A022129 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022129() {
    super(new long[] {1, 1}, new long[] {3, 20});
  }
}
