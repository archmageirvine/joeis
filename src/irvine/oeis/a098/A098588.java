package irvine.oeis.a098;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A098588 a(n) = 2^n for n = 0..4; for n &gt; 4, a(n) = 2*a(n-1) + a(n-5).
 * @author Sean A. Irvine
 */
public class A098588 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098588() {
    super(new long[] {1, 0, 0, 0, 2}, new long[] {1, 2, 4, 8, 16});
  }
}
