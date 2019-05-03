package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022135 Fibonacci sequence beginning <code>4, 19</code>.
 * @author Sean A. Irvine
 */
public class A022135 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022135() {
    super(new long[] {1, 1}, new long[] {4, 19});
  }
}
