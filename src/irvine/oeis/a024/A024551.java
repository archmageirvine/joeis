package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024551 a(n) = floor(a(n-1)/(sqrt(5) - 2)) for n &gt; 0 and a(0) = 1.
 * @author Sean A. Irvine
 */
public class A024551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024551() {
    super(new long[] {-1, -3, 5}, new long[] {1, 4, 16});
  }
}
