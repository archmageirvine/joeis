package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022112 Fibonacci sequence beginning <code>2, 6</code>.
 * @author Sean A. Irvine
 */
public class A022112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022112() {
    super(new long[] {1, 1}, new long[] {2, 6});
  }
}
