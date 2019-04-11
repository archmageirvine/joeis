package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024551 <code>a(n) = floor(a(n-1)/(sqrt(5) - 2))</code> for <code>n &gt; 0</code> and <code>a(0) = 1</code>.
 * @author Sean A. Irvine
 */
public class A024551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024551() {
    super(new long[] {-1, -3, 5}, new long[] {1, 4, 16});
  }
}
