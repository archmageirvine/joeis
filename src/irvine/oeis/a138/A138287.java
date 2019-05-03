package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138287 Palindromic period <code>10</code>: repeat <code>0, 2, 8, 4, 6, 6, 4, 8, 2, 0</code>.
 * @author Sean A. Irvine
 */
public class A138287 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138287() {
    super(new long[] {1, -1, 1, -1, 1, -1, 1, -1, 1}, new long[] {0, 2, 8, 4, 6, 6, 4, 8, 2});
  }
}
