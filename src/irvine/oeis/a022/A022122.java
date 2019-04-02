package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022122 Fibonacci sequence beginning 3, 10.
 * @author Sean A. Irvine
 */
public class A022122 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022122() {
    super(new long[] {1, 1}, new long[] {3, 10});
  }
}
