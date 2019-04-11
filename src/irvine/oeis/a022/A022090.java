package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022090 Fibonacci sequence beginning <code>0, 7</code>.
 * @author Sean A. Irvine
 */
public class A022090 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022090() {
    super(new long[] {1, 1}, new long[] {0, 7});
  }
}
