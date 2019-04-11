package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022390 Fibonacci sequence beginning <code>8, 17</code>.
 * @author Sean A. Irvine
 */
public class A022390 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022390() {
    super(new long[] {1, 1}, new long[] {8, 17});
  }
}
