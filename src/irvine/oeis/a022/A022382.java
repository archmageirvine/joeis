package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022382 Fibonacci sequence beginning <code>4, 10</code>.
 * @author Sean A. Irvine
 */
public class A022382 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022382() {
    super(new long[] {1, 1}, new long[] {4, 10});
  }
}
