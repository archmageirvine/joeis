package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022398 Fibonacci sequence beginning <code>1, 28</code>.
 * @author Sean A. Irvine
 */
public class A022398 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022398() {
    super(new long[] {1, 1}, new long[] {1, 28});
  }
}
