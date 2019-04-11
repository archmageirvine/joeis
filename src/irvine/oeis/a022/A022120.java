package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022120 Fibonacci sequence beginning <code>3, 7</code>.
 * @author Sean A. Irvine
 */
public class A022120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022120() {
    super(new long[] {1, 1}, new long[] {3, 7});
  }
}
