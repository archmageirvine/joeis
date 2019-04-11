package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022345 Fibonacci sequence beginning <code>0, 11</code>.
 * @author Sean A. Irvine
 */
public class A022345 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022345() {
    super(new long[] {1, 1}, new long[] {0, 11});
  }
}
