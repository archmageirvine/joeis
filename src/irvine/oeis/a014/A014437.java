package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014437 Odd Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A014437 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014437() {
    super(new long[] {1, 0, 4, 0}, new long[] {1, 1, 3, 5});
  }
}

