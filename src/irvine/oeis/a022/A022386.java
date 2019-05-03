package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022386 Fibonacci sequence beginning <code>4, 26</code>.
 * @author Sean A. Irvine
 */
public class A022386 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022386() {
    super(new long[] {1, 1}, new long[] {4, 26});
  }
}
