package irvine.oeis.a065;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A065563 Product of three consecutive Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A065563 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065563() {
    super(1, new long[] {-1, -3, 6, 3}, new long[] {2, 6, 30, 120});
  }
}
