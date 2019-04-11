package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061084 Fibonacci-type sequence based on subtraction: <code>a(0) = 1, a(1) = 2</code> and <code>a(n) = a(n-2)-a(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A061084 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061084() {
    super(new long[] {1, -1}, new long[] {1, 2});
  }
}
