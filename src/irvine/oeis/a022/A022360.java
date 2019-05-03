package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022360 Fibonacci sequence beginning <code>0, 26</code>.
 * @author Sean A. Irvine
 */
public class A022360 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022360() {
    super(new long[] {1, 1}, new long[] {0, 26});
  }
}
