package irvine.oeis.a061;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A061084 Fibonacci-type sequence based on subtraction: a(0) = 1, a(1) = 2 and a(n) = a(n-2)-a(n-1).
 * @author Sean A. Irvine
 */
public class A061084 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061084() {
    super(new long[] {1, -1}, new long[] {1, 2});
  }
}
